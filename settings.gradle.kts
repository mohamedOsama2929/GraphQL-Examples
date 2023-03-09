rootProject.name = "apollo-kotlin-tutorial"
include(":app")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
include(":schema")
include(":feature")
include(":featuretwo")
