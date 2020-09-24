@file:Suppress("FunctionName")

package com.chrynan.pathmatch.core

/**
 * Creates a [Regex] instance with the provided Glob-like pattern.
 *
 * @see [Regex]
 * @see [GlobRegexMatcher]
 * @see [convertGlobToRegex]
 */
fun Glob(pattern: String): Regex = Regex(convertGlobToRegex(pattern))

/**
 * Creates a [Regex] instance with the provided Glob-like pattern and Regex [option].
 *
 * @see [Regex]
 * @see [GlobRegexMatcher]
 * @see [convertGlobToRegex]
 */
fun Glob(pattern: String, option: RegexOption) = Regex(convertGlobToRegex(pattern), option)

/**
 * Creates a [Regex] instance with the provided Glob-like pattern and Regex [options].
 *
 * @see [Regex]
 * @see [GlobRegexMatcher]
 * @see [convertGlobToRegex]
 */
fun Glob(pattern: String, options: Set<RegexOption>) = Regex(convertGlobToRegex(pattern), options)
