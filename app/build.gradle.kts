plugins {
    alias(libs.plugins.jvm)

    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    testImplementation(libs.junit.jupiter.engine)
    testImplementation(libs.kotest.runner)
    testImplementation(libs.kotest.assertions)

    implementation(libs.guava)
    implementation(libs.kotlin.coroutines)
    implementation("io.ktor:ktor-client-core:2.0.1")
    implementation("io.ktor:ktor-client-cio:2.0.1")
    implementation("org.jsoup:jsoup:1.13.1")
}

application {
    mainClass.set("aoc23.AppKt")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
