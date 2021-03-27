//[pathmatch-core](../../../index.md)/[com.chrynan.pathmatch.core](../index.md)/[Path](index.md)



# Path  
 [common] inline class [Path](index.md)(**value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

An inline class wrapping a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) path value.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.pathmatch.core/Path/Path/#kotlin.String/PointingToDeclaration/"></a>[Path](-path.md)| <a name="com.chrynan.pathmatch.core/Path/Path/#kotlin.String/PointingToDeclaration/"></a> [common] fun [Path](-path.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core/Path/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.pathmatch.core/Path/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core//matches/com.chrynan.pathmatch.core.Path#kotlin.Function1[com.chrynan.pathmatch.core.PathMatcher,kotlin.Boolean]/PointingToDeclaration/"></a>[matches](../matches.md)| <a name="com.chrynan.pathmatch.core//matches/com.chrynan.pathmatch.core.Path#kotlin.Function1[com.chrynan.pathmatch.core.PathMatcher,kotlin.Boolean]/PointingToDeclaration/"></a>[common]  <br>Content  <br>infix fun [Path](index.md).[matches](../matches.md)(operation: [PathMatcher](../-path-matcher/index.md).() -> [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether this [Path](index.md) matches according to the provided [operation](../matches.md).  <br><br><br>|
| <a name="com.chrynan.pathmatch.core//matchResult/com.chrynan.pathmatch.core.Path#kotlin.Function1[com.chrynan.pathmatch.core.PathMatcher,TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[matchResult](../match-result.md)| <a name="com.chrynan.pathmatch.core//matchResult/com.chrynan.pathmatch.core.Path#kotlin.Function1[com.chrynan.pathmatch.core.PathMatcher,TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>infix fun <[R](../match-result.md)> [Path](index.md).[matchResult](../match-result.md)(operation: [PathMatcher](../-path-matcher/index.md).() -> [R](../match-result.md)): [R](../match-result.md)  <br>More info  <br>Retrieves the value from the provided [operation](../match-result.md) using this [Path](index.md).  <br><br><br>|

