//plugins {
//	id("org.springframework.boot") version "3.0.1"
//	kotlin("plugin.spring") version "1.7.22"
//	kotlin("plugin.jpa") version "1.7.22"
//}
//
//java.sourceCompatibility = JavaVersion.VERSION_17
//
//dependencies {
//	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//	implementation("org.springframework.boot:spring-boot-starter-validation")
//	implementation("org.springframework.boot:spring-boot-starter-web")
//	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//	implementation("org.modelmapper:modelmapper:3.1.1")
//	implementation("org.jetbrains.kotlin:kotlin-reflect")
//	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//	runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
//	testImplementation("org.springframework.boot:spring-boot-starter-test")
//}
//
//tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//	kotlinOptions {
//		freeCompilerArgs = listOf("-Xjsr305=strict")
//		jvmTarget = "17"
//	}
//}
