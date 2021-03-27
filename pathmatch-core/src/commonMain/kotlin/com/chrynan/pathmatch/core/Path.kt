@file:Suppress("unused")

package com.chrynan.pathmatch.core

/**
 * An inline class wrapping a [String] path value.
 */
inline class Path(val value: String)

/**
 * Determines whether this [Path] matches according to the provided [operation].
 */
infix fun Path.matches(operation: PathMatcher.() -> Boolean): Boolean {
    val pathMatcher = PathMatcher(value)

    return operation.invoke(pathMatcher)
}

/**
 * Retrieves the value from the provided [operation] using this [Path].
 */
infix fun <R> Path.matchResult(operation: PathMatcher.() -> R): R {
    val pathMatcher = PathMatcher(value)

    return operation.invoke(pathMatcher)
}
