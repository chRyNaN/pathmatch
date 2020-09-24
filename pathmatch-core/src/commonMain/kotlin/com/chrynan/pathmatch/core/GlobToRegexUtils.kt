package com.chrynan.pathmatch.core

/**
 * Converts the provided Glob-like [pattern] to a Regex pattern [String].
 *
 * Adapted from the following source: https://stackoverflow.com/a/1248627/1478764
 */
internal fun convertGlobToRegex(pattern: String): String = buildString {
    val line = pattern.trim { it <= ' ' }

    var escaping = false
    var inCurlies = 0

    for (currentChar in line.toCharArray()) {
        when (currentChar) {
            '*' -> {
                if (escaping) append("\\*") else append(".*")
                escaping = false
            }
            '?' -> {
                if (escaping) append("\\?") else append('.')
                escaping = false
            }
            '.', '(', ')', '+', '|', '^', '$', '@', '%' -> {
                append('\\')
                append(currentChar)
                escaping = false
            }
            '\\' -> {
                escaping = if (escaping) {
                    append("\\\\")
                    false
                } else true
            }
            '{' -> {
                if (escaping) {
                    append("\\{")
                } else {
                    append('(')
                    inCurlies++
                }
                escaping = false
            }
            '}' -> {
                if (inCurlies > 0 && !escaping) {
                    append(')')
                    inCurlies--
                } else if (escaping) {
                    append("\\}")
                } else {
                    append("}")
                }
                escaping = false
            }
            ',' -> {
                if (inCurlies > 0 && !escaping) {
                    append('|')
                } else if (escaping) {
                    append("\\,")
                } else {
                    append(",")
                }
            }
            else -> {
                escaping = false
                append(currentChar)
            }
        }
    }
}
