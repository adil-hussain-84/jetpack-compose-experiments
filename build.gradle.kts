plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}

tasks.wrapper {
    gradleVersion = "8.4"
}