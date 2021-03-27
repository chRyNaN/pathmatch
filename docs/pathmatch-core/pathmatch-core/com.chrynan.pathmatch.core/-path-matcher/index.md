//[pathmatch-core](../../../index.md)/[com.chrynan.pathmatch.core](../index.md)/[PathMatcher](index.md)



# PathMatcher  
 [common] interface [PathMatcher](index.md)

An interface that provides a means to match a Path [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) with a pattern of some type.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core/PathMatcher/exact/#kotlin.String/PointingToDeclaration/"></a>[exact](exact.md)| <a name="com.chrynan.pathmatch.core/PathMatcher/exact/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract infix fun [exact](exact.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether the [path](path.md) exactly matches the provided [input](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).  <br><br><br>|
| <a name="com.chrynan.pathmatch.core/PathMatcher/glob/#kotlin.String/PointingToDeclaration/"></a>[glob](glob.md)| <a name="com.chrynan.pathmatch.core/PathMatcher/glob/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract infix fun [glob](glob.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether the [path](path.md) matches this Glob-like [pattern](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).  <br><br><br>|
| <a name="com.chrynan.pathmatch.core/PathMatcher/regex/#kotlin.String/PointingToDeclaration/"></a>[regex](regex.md)| <a name="com.chrynan.pathmatch.core/PathMatcher/regex/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract infix fun [regex](regex.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether the [path](path.md) matches this [Regex](regex.md)[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core/PathMatcher/path/#/PointingToDeclaration/"></a>[path](path.md)| <a name="com.chrynan.pathmatch.core/PathMatcher/path/#/PointingToDeclaration/"></a> [common] abstract val [path](path.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)The Path [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) that this [PathMatcher](index.md) uses in the match functions.   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core//matchesExactly/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[matchesExactly](../matches-exactly.md)| <a name="com.chrynan.pathmatch.core//matchesExactly/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>infix fun [PathMatcher](index.md).[matchesExactly](../matches-exactly.md)(input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>A convenience function that delegates to the [PathMatcher.exact](exact.md) function.  <br><br><br>|
| <a name="com.chrynan.pathmatch.core//matchesGlob/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[matchesGlob](../matches-glob.md)| <a name="com.chrynan.pathmatch.core//matchesGlob/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>infix fun [PathMatcher](index.md).[matchesGlob](../matches-glob.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>A convenience function that delegates to the [PathMatcher.glob](glob.md) function.  <br><br><br>|
| <a name="com.chrynan.pathmatch.core//matchesRegex/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[matchesRegex](../matches-regex.md)| <a name="com.chrynan.pathmatch.core//matchesRegex/com.chrynan.pathmatch.core.PathMatcher#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>infix fun [PathMatcher](index.md).[matchesRegex](../matches-regex.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>A convenience function that delegates to the [PathMatcher.regex](regex.md) function.  <br><br><br>|

