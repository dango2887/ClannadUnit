// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    dependencies {
        // vanniktech 发布插件
        classpath(libs.gradle.maven.publish.plugin)
        // Kotlin Javadoc，非必须
        classpath(libs.dokka.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    id("com.vanniktech.maven.publish") version "0.28.0" apply false
}