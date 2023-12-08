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
        create("libs") {
            library("activity-compose", "androidx.activity:activity-compose:1.8.1")
            library("compose-bom", "androidx.compose:compose-bom:2023.10.01")
        }
    }
}

include(":app1")
include(":app3")
