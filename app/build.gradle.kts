plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "co.edu.unipiloto.ingreso"
    compileSdk = 34

    defaultConfig {
        applicationId = "co.edu.unipiloto.ingreso"
        minSdk = 19
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    buildFeatures {
        viewBinding = true
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation ("com.google.firebase:firebase-messaging:20.1.0")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.android.gms:play-services-location:21.2.0")
    implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("com.google.android.gms:play-services-location:17.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.google.android.gms:play-services-location:21.2.0")
    implementation ("com.google.maps.android:android-maps-utils:2.3.0")
    implementation ("com.google.maps:google-maps-services:2.1.0")
    // Firebase UI Database
    implementation ("com.google.firebase:firebase-firestore:23.0.4")
}