# Jetpack Compose Android Single Module Starter
This is a single module and single activity starter template for an Android project which uses Jetpack Compose.

# Why?
To streamline my development and eliminate the repetitive project setup, I created this starter template for Jetpack Compose projects. It serves as a reusable foundation for future projects, allowing for faster and more consistent project initialization. Simply clone the repo, change the package name, and you're off to the races with your new project!

# What's included?
This project includes the latest version of the following libraries:

- Jetpack Compose
- Jetpack Type-Safe Navigation (will be replaced with Navigation 3 when it's out of Alpha/Beta)
- Kotlin Serialization
- Kotlin Coroutines
- KSP (Kotlin Symbol Processing, replaces Kapt)
- Starter custom theme, available globally via `compositionLocal`. For example:

```kt
Text(
  color = LocalAppColors.current.onSurface,
  text = "Hello, World!"
)
```
The provided colors were made with the <a href="https://material-foundation.github.io/material-theme-builder/" target="_blank">Material3 Theme Builder</a> with a Source color of #177BBD, but can be customized via [CustomColorsPalette.kt](https://github.com/wfahnestock/android-single-module-starter/blob/main/app/src/main/java/com/changeme/androidsinglemodulestarter/ui/theme/CustomColorsPalette.kt)

# Current Build Status
![Build Status](https://github.com/wfahnestock/android-single-module-starter/actions/workflows/android.yml/badge.svg)
