@file:Suppress("unused")

package com.chrynan.pathmatch.core

/**
 * A convenience function that delegates to the [PathMatcher.glob] function. This alternative convenience function
 * exists so that the naming makes more sense in certain usages.
 */
infix fun PathMatcher.matchesGlob(pattern: String): Boolean = glob(pattern)

/**
 * A convenience function that delegates to the [PathMatcher.regex] function. This alternative convenience function
 * exists so that the naming makes more sense in certain usages.
 */
infix fun PathMatcher.matchesRegex(pattern: String): Boolean = regex(pattern)

/**
 * A convenience function that delegates to the [PathMatcher.exact] function. This alternative convenience function
 * exists so that the naming makes more sense in certain usages.
 */
infix fun PathMatcher.matchesExactly(input: String): Boolean = exact(input)

/**
 * Creates an instance of a [PathMatcher] for the provided [path] [String].
 */
@Suppress("FunctionName")
fun PathMatcher(path: String): PathMatcher = KotlinPathMatcher(path)

/**
 * Determines whether the provided [path] matches the provided [operation] logic and returns the result.
 */
fun pathMatches(path: String, operation: PathMatcher.() -> Boolean): Boolean {
    val pathMatcher = PathMatcher(path)

    return operation.invoke(pathMatcher)
}

/**
 * Invokes the provided [operation] with a [PathMatcher] from the provided [path] and returns its result.
 */
fun <R> pathMatchResult(path: String, operation: PathMatcher.() -> R): R {
    val pathMatcher = PathMatcher(path)

    return operation.invoke(pathMatcher)
}
