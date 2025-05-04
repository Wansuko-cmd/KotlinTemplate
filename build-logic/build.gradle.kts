plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.gradle.kotlin)
}

gradlePlugin {
    plugins {
        register("kotlinJvm") {
            id = "com.wsr.jvm"
            implementationClass = "KotlinJvmPlugin"
        }
        register("kotlinMultiPlatform") {
            id = "com.wsr.multiplatform"
            implementationClass = "KotlinMultiPlatformPlugin"
        }
    }
}
