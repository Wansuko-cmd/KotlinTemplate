plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.ktlint)
}

tasks.register<Delete>(name = "clean") {
    delete(rootProject.layout.buildDirectory)
}
