plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
	id("org.jetbrains.kotlin.jvm") version "1.8.0"
	id("org.jetbrains.kotlin.plugin.spring") version "1.8.0"
}

group = "com.saewoo"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(project(":user-service"))
	implementation("org.springframework.boot:spring-boot-starter")
	runtimeOnly("com.mysql:mysql-connector-j")
}

tasks.withType<Test>().configureEach {
	enabled = false
}

tasks.register("prepareKotlinBuildScriptModel"){}
