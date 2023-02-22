buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.springframework.boot") version "3.0.2" apply false
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.7.22"
    kotlin("plugin.spring") version "1.7.22"
    kotlin("plugin.jpa") version "1.7.22"
}

allprojects {
    group = "pl.mattiahit.myrestaurant"
    version = "0.0.1-SNAPSHOT"

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

//    apply(plugin = "io.spring.dependency-management")
//    apply(plugin = "plugin.jpa")
//    apply(plugin = "kotlin")
//
//    repositories {
//        mavenCentral()
//    }
//
//    tasks.withType<Test> {
//        useJUnitPlatform()
//    }
//
//    dependencies {
//        implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    }


}

subprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "io.spring.dependency-management")
//    apply(plugin = "plugin.jpa")
//    apply(plugin = "kotlin")

}