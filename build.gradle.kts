plugins {
    id("jacoco")

    alias(libraries.plugins.android.application) apply false
    alias(libraries.plugins.android.library) apply false
    alias(libraries.plugins.google.ksp) apply false
    alias(libraries.plugins.jetbrains.kotlin) apply false
    alias(libraries.plugins.jetbrains.multiplatform) apply false
    alias(libraries.plugins.jetbrains.serialization) apply false
    alias(libraries.plugins.dexcount) apply false
    alias(libraries.plugins.detekt) apply false
    // TODO Pedrinho, help me
//    alias(libraries.plugins.pedrinho_publish) apply false
}
