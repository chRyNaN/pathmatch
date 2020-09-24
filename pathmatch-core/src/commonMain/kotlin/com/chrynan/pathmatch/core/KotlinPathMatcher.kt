package com.chrynan.pathmatch.core

/**
 * A basic implementation of [PathMatcher] that delegates to [GlobRegexMatcher], [RegexMatcher], and [ExactMatcher]
 * for the [glob], [regex], and [exact] function calls.
 */
internal class KotlinPathMatcher(override val path: String) : PathMatcher {

    private val globRegexMatcher = GlobRegexMatcher()
    private val regexMatcher = RegexMatcher()
    private val exactMatcher = ExactMatcher()

    override fun glob(pattern: String): Boolean = globRegexMatcher.matches(pattern = pattern, input = path)

    override fun regex(pattern: String): Boolean = regexMatcher.matches(pattern = pattern, input = path)

    override fun exact(input: String): Boolean = exactMatcher.matches(pattern = input, input = path)
}
