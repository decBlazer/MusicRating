plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
    id("org.jetbrains.kotlin.plugin.compose")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("kotlin-android")
    id("com.google.relay") version "0.3.12"
}

android {
    namespace = "com.varughese.musicrating"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.varughese.musicrating"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.ui.tooling.preview.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    ///Splash Api
    implementation(libs.splashscreen)

    //Compose Navigation
    implementation(libs.navigation.compose)

    //Dagger Hilt
    implementation(libs.hilt.android)
    implementation(libs.hilt.navigation.compose)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    kapt(libs.androidx.hilt.compiler)

    //Coil
    implementation(libs.coil.compose)

    //Datastore
    implementation(libs.datastore.preferences)

    //Compose Foundation
    implementation(libs.foundation)

    //Accompanist
    implementation(libs.accompanist.systemuicontroller)

    //Paging 3
    implementation(libs.paging.runtime.ktx)
    implementation(libs.paging.compose)

    //Room
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)

    //KTOR
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)

    //Kotlinx Serialization
    implementation(libs.kotlinx.serialization.json)

    //KTOR Content negotiation
    implementation(libs.ktor.client.content.negotiation)

    // JSON Serialization
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.serialization)

    // Timber
    implementation(libs.timber)

    // Serialization
    implementation(libs.kotlinx.serialization.json.v160)

    implementation(libs.androidx.activity.compose.v140)
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.androidx.runtime.rxjava2)

    implementation(libs.coil.compose.v210)
    implementation(libs.coil.gif)
    implementation(libs.splashscreen)
}