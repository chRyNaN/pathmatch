package com.chrynan.pathmatch.core

/**
 * A [Matcher] implementation that simply checks if the provided pattern and input values equal each other.
 */
internal class ExactMatcher : Matcher {

    override fun matches(pattern: String, input: String): Boolean = pattern == input
}
