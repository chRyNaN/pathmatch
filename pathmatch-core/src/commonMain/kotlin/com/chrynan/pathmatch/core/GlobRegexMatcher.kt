package com.chrynan.pathmatch.core

/**
 * An implementation of the [Matcher] interface for Glob-like patterns. The implementation works by converting the
 * provided Glob-like pattern to a Regex pattern and then comparing the input with that.
 */
internal class GlobRegexMatcher : Matcher {

    override fun matches(pattern: String, input: String): Boolean {
        val regexString = convertGlobToRegex(pattern = pattern)
        val regex = Regex(regexString)

        return input matches regex
    }
}
