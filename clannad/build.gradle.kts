plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.dango.clannad"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dango.clannad"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":lib:kit"))
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)

    implementation("com.google.android.gms:play-services-games-v2:20.1.0")
    implementation("com.google.android.gms:play-services-location:21.2.0")

}