@Suppress("DSL_SCOPE_VIOLATION") // Remove once KTIJ-19369 is fixed

plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    kotlin("android") version libs.versions.kotlin apply false
}

tasks.create<Delete>("clean") {
    allprojects.forEach { delete(it.buildDir) }
}
