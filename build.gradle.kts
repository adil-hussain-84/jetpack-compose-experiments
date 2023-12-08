import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.android.application") version "8.2.0" apply false
    id("com.github.ben-manes.versions") version "0.50.0"
    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
}

tasks.wrapper {
    gradleVersion = "8.5"
}

// Alter the default behaviour of the "com.github.ben-manes.versions" plugin
tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version)
    }
}

fun isNonStable(version: String): Boolean {
    val versionInLowercase = version.lowercase()

    return setOf("alpha", "beta", "rc").any { versionInLowercase.contains(it) }
}
