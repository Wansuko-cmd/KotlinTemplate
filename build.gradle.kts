plugins {
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.ktlint)
}

tasks.register<Delete>(name = "clean") {
    delete(rootProject.layout.buildDirectory)
}
