allprojects {
    repositories {
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
        google()
        mavenCentral()
    }
}

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kapt) apply false
    alias(libs.plugins.hilt) apply false
}