package com.chrynan.pathmatch.core

/**
 * An interface that provides a means to match a Path [String] with a pattern of some type.
 */
interface PathMatcher {

    /**
     * The Path [String] that this [PathMatcher] uses in the match functions.
     */
    val path: String

    /**
     * Determines whether the [path] matches this Glob-like [pattern] [String]. Returns true if it matches, false
     * otherwise.
     */
    infix fun glob(pattern: String): Boolean

    /**
     * Determines whether the [path] matches this [Regex] [pattern] [String]. Returns true if it matches, false
     * otherwise.
     */
    infix fun regex(pattern: String): Boolean

    /**
     * Determines whether the [path] exactly matches the provided [input] [String]. Returns true if it matches, false
     * otherwise.
     */
    infix fun exact(input: String): Boolean
}
