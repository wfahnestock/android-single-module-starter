# Jetpack Compose Android Single Module Starter
This is a single module and single activity starter project/template for an Android project using Jetpack Compose.

# Why?
I got tired of creating a new project and setting up the same boilerplate over and over again. So I decided to create a starter project that I can use as a template for my future projects.

# What's included?
This project includes the latest version of the following libraries:

- Jetpack Compose
- Jetpack Navigation
- Kotlin Serialization
- Kotlin Coroutines
- KSP (Kotlin Symbol Processing, replaces Kapt)
- Starter custom color theme, available via `compositionLocal`. For example:

```kt
Text(
  color = LocalAppColors.current.onSurface
  ...
)
```
The provided colors are the same as Material3, but can be customized via [CustomColorsPalette.kt](https://github.com/wfahnestock/android-single-module-starter/blob/main/app/src/main/java/com/changeme/androidsinglemodulestarter/ui/theme/CustomColorsPalette.kt)

# Current Build Status
![Build Status](https://github.com/wfahnestock/android-single-module-starter/actions/workflows/android.yml/badge.svg)
