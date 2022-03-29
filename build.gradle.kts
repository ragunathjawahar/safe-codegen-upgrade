import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.4.10"
  kotlin("kapt") version "1.4.10"
  application
}

group = "xyz.ragunath"
version = "0.1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

val moshiVersion = "1.11.0"

dependencies {
  implementation("com.squareup.moshi:moshi:$moshiVersion")
  kapt("com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion")

  testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
  testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.0")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

  testImplementation("com.google.truth:truth:1.1.3")

  testImplementation("com.approvaltests:approvaltests:15.0.0")
}

tasks.test {
  useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}

application {
  mainClass.set("MainKt")
}
