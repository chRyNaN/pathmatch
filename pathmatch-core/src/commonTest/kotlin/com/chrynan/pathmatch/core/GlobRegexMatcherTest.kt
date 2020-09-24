package com.chrynan.pathmatch.core

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GlobRegexMatcherTest {

    private val matcher = GlobRegexMatcher()

    @Test
    fun exactFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Test.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun noMatchReturnsFalse() {
        val result = matcher.matches(pattern = "Test.kt", input = "SomethingElse.kt")

        assertFalse(result)
    }

    @Test
    fun singleWildcardFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Tes?.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Tes*.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardForMultipleCharsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Te*.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun startingMultipleWildcardForMultipleCharsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "*st.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun startingMultipleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "*est.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun endingMultipleWildcardForMultipleCharsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Test.*", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun endingMultipleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Test.k*", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun endingSingleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Test.k?", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun startingSingleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "?est.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun middleMultipleWildcardForMultipleCharsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "T*t.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun middleMultipleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Te*t.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun middleSingleWildcardForSingleCharInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "Te?t.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardForMultipleCharsInFileNameReturnsFalse() {
        val result = matcher.matches(pattern = "T?t.kt", input = "Test.kt")

        assertFalse(result)
    }

    @Test
    fun multipleWildcardsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "*s*.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardInFileNameForPeriodReturnsTrue() {
        val result = matcher.matches(pattern = "Test*kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleSingleWildCardsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "T?s?.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardInFileNameForPeriodReturnsTrue() {
        val result = matcher.matches(pattern = "Test?kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleConsecutiveMultipleWildcardsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "**.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleConsecutiveSingleWildcardsInFileNameReturnsTrue() {
        val result = matcher.matches(pattern = "??st.kt", input = "Test.kt")

        assertTrue(result)
    }

    @Test
    fun exactPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "/whatever/Test.kt", input = "/whatever/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardForPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "/*/Test.kt", input = "/whatever/Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardInPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "/whate?er/Test.kt", input = "/whatever/Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardInSingleCharPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "/?/Test.kt", input = "/a/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardInMiddlePathReturnsTrue() {
        val result = matcher.matches(pattern = "/whatever/*/other/Test.kt", input = "/whatever/hgjf/other/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleConsecutiveWildcardsInPathReturnsTrue() {
        val result = matcher.matches(pattern = "/**/Test.kt", input = "/whatever/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleConsecutiveSingleWildcardsInPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "/??atever/Test.kt", input = "/whatever/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardsInPathNameCountsAsMultiplePaths() {
        val result = matcher.matches(pattern = "/**/Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardsInPathNameCountsAsMultiplePathsWithoutPrecedingSlash() {
        val result = matcher.matches(pattern = "**/Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardInPathNameCountsAsMultiplePaths() {
        val result = matcher.matches(pattern = "/*/Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardInPathNameCountsAsMultiplePathsWithoutPrecedingSlash() {
        val result = matcher.matches(pattern = "*/Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }

    @Test
    fun multipleWildcardsBeforeFileNameCountsAsPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "**Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }

    @Test
    fun singleWildcardBeforeFileNameCountsAsPathNameReturnsTrue() {
        val result = matcher.matches(pattern = "*Test.kt", input = "/whatever/another/Test.kt")

        assertTrue(result)
    }
}
