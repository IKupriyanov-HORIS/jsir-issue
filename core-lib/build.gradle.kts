plugins {
    id("org.jetbrains.kotlin.multiplatform")
    `maven-publish`
}

group = "me.ikupriyanov"
version = "1.0-SNAPSHOT"

kotlin {
    jvm {
    }

    // Can be changed to BOTH, but for some reason from time to time I get the following build error
    // > Task :kotlinNpmInstall FAILED
    // 15 actionable tasks: 5 executed, 10 up-to-date
    // error There are more than one workspace with name "jsir-issue-core-lib-js-legacy"
    //
    // FAILURE: Build failed with an exception.
    js(IR) {
        browser()
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("test"))
                compileOnly("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                //compileOnly("org.jetbrains.kotlinx:kotlinx-datetime:0.3.2") // doesn't work either
            }
        }
        val jvmTest by getting
        val jsMain by getting
        val jsTest by getting
    }
}
