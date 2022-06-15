plugins {
    id("org.jetbrains.kotlin.js")
}

repositories {
    mavenLocal()
}

dependencies {
    implementation("me.ikupriyanov:core-lib-js:1.0-SNAPSHOT")
    testImplementation("org.jetbrains.kotlin:kotlin-test-js")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}
