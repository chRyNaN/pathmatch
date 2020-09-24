package com.chrynan.pathmatch.core

/**
 * An interface for a class that can determine whether a provided [String] input matches a provided [String] pattern.
 *
 * Different implementations of this interface will have different pattern syntax rules.
 */
interface Matcher {

    /**
     * Determines whether the provided [input] matches the provided [pattern] according to this [Matcher]'s pattern
     * syntax rules.
     *
     * @return True if the [input] matches the [pattern], false otherwise.
     */
    fun matches(pattern: String, input: String): Boolean
}
