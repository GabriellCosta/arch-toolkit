plugins {
    id("toolkit-library")
    id("toolkit-publish")
}

android.namespace = "br.com.arch.toolkit.recycler.adapter"

dependencies {
    // Libraries
    compileOnly(libraries.jetbrains.stdlib.jdk8)
    compileOnly(libraries.androidx.recycler)
}