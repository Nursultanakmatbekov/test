plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    // Kapt
    id ("kotlin-kapt")
    // Hilt
    id ("com.google.dagger.hilt.android")
}

android {
    namespace = ("com.example.data")
    compileSdk = 33

    defaultConfig {
        minSdk = 25
        targetSdk = 33

        testInstrumentationRunner = ("androidx.test.runner.AndroidJUnitRunner")
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
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
}

dependencies {
// Domain
    implementation(project (":domain"))
    //Hilt
    implementation ("com.google.dagger:hilt-android:2.44")
    kapt ("com.google.dagger:hilt-compiler:2.44")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Gson convertor
    implementation ("com.google.code.gson:gson:2.9.0")

    //OkHttp client
    implementation ("com.squareup.okhttp3:okhttp-bom:4.10.0")

    // define any required OkHttp artifacts without version
    implementation ("com.squareup.okhttp3:okhttp")
    implementation ("com.squareup.okhttp3:logging-interceptor")
}