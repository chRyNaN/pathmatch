package com.chrynan.pathmatch.core

/**
 * A [Matcher] implementation that checks if the provided input matches the provided [Regex] pattern.
 */
internal class RegexMatcher : Matcher {

    override fun matches(pattern: String, input: String): Boolean = input matches Regex(pattern)
}
