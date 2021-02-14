plugins {
    id("org.jetbrains.kotlin.multiplatform") version "1.4.30"
}

kotlin {
    ios()
    watchos()
    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common:1.4.30")
            }
        }
        commonTest {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}

repositories {
    mavenCentral()
}
