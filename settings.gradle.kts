pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
    }

    versionCatalogs {
        create("compilers") {
            version("compose", "1.5.8")
        }
        create("libs") {
            library("activity-compose", "androidx.activity:activity-compose:1.8.2")
            library("compose-bom", "androidx.compose:compose-bom:2023.10.01")
            library("core-ktx", "androidx.core:core-ktx:1.12.0")
            library("lifecycle-runtime-ktx", "androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
        }
    }
}

include(":app1")
include(":app3")
include(":app2")
