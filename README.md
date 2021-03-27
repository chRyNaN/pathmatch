# pathmatch

A simple path matching utility for Kotlin Multi-platform.

```kotlin
val matches = Path("./Example.kt") matches {
    when {
        exact("Example.kt") -> true
        glob("*/Example.kt") -> true
        regex(".*\\.kt") -> true
        else -> false
    }
}
```

## Usage

### Determine if a Path matches a Pattern

```kotlin
val matches = Path("./Example.kt") matches {
    when {
        exact("Example.kt") -> true
        glob("*/Example.kt") -> true
        regex(".*\\.kt") -> true
        else -> false
    }
}
```

### Retrieve a custom result if a Path matches a Pattern

```kotlin
val result = Path("./Example.kt") matchResult {
    when {
        exact("Example.kt") -> getExactMatchValue()
        glob("*/Example.kt") -> getGlobMatchValue()
        regex(".*\\.kt") -> getRegexMatchValue()
        else -> null
    }
}
```

### Using a PathMatcher directly

```kotlin
val pathMatcher = PathMatcher("./Example.kt")

pathMatcher matchesExactly "Example.kt"
pathMatcher matchesGlob "*/Example.kt"
pathMatcher matchesRegex ".*\\.kt"
```

### Getting a Regex from a Glob-like pattern

```kotlin
val glob = Glob("*/Example.kt")

glob.matches("/Example.kt")
```

## Building

The library is provided through [Bintray](https://bintray.com/chrynan/chrynan). Checkout
the [releases page](https://github.com/chRyNaN/pathmatcher/releases) to get the latest version.

### Repository

```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependencies

The library uses the new Kotlin 1.4.0 setup, so you can simply specify the common dependency for the `commonMain` source
set:

```groovy
commonMain {
    dependencies {
        implementation "com.chrynan.pathmatcher:pathmatcher-core:$VERSION"
    }
}
```

If you need dependencies for specific targets, they are listed below:

#### Kotlin Common:

```groovy
implementation "com.chrynan.pathmatcher:pathmatcher-core:$VERSION"
```

#### Kotlin JVM:

```groovy
implementation "com.chrynan.pathmatcher:pathmatcher-core-jvm:$VERSION"
```

#### Kotlin JS:

```groovy
implementation "com.chrynan.pathmatcher:pathmatcher-core-js:$VERSION"
```

#### Kotlin iOS ARM64:

```groovy
implementation "com.chrynan.pathmatcher:pathmatcher-core-ios-arm64:$VERSION"
```

#### Kotlin iOS x64:

```groovy
implementation "com.chrynan.pathmatcher:pathmatcher-core-ios-x64:$VERSION"
```

## License

```
Copyright 2020 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
