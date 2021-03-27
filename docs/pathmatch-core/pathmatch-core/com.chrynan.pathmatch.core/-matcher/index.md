//[pathmatch-core](../../../index.md)/[com.chrynan.pathmatch.core](../index.md)/[Matcher](index.md)



# Matcher  
 [common] interface [Matcher](index.md)

An interface for a class that can determine whether a provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) input matches a provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) pattern.



Different implementations of this interface will have different pattern syntax rules.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.pathmatch.core/Matcher/matches/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[matches](matches.md)| <a name="com.chrynan.pathmatch.core/Matcher/matches/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [matches](matches.md)(pattern: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), input: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether the provided [input](matches.md) matches the provided [pattern](matches.md) according to this [Matcher](index.md)'s pattern syntax rules.  <br><br><br>|

