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
}

application {
    mainClass.set("aoc23.AppKt")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
