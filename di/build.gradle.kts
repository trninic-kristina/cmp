plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "di"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting{
        dependencies {
            implementation(project(":data"))
            implementation(project(":domain"))
            //put your multiplatform dependencies here
        }
    }
    }
}

android {
    namespace = "com.example.di"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
