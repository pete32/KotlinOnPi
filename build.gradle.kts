import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    application
    id("com.github.johnrengelman.shadow") version "6.1.0"
}
group = "me.pete3"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven { url = uri("https://jitpack.io") }
    maven { url = uri("https://oss.sonatype.org/content/groups/public") }
}
dependencies {
    testImplementation(kotlin("test-junit"))

    implementation("com.pi4j:pi4j-core:1.2")
    implementation("com.github.mhashim6:Pi4K:0.1")

}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
application {
    mainClassName = "MainKt"
}