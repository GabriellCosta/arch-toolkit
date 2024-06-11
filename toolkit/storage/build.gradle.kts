plugins {
    id("toolkit-android-library")
    id("toolkit-publish")
}

android.namespace = "br.com.arch.toolkit.storage"

dependencies {
    // JetBrains
    implementation(libraries.jetbrains.stdlib.jdk8)
    implementation(libraries.jetbrains.coroutines.core)

    // Androidx
    implementation(libraries.androidx.security)
    implementation(libraries.androidx.startup)

    // Tools
    implementation(libraries.square.timber)
    implementation("com.google.code.gson:gson:2.11.0")

}
