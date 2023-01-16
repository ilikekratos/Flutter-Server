plugins {
    java
    war
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
    id("org.graalvm.buildtools.native") version "0.9.18"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    "compileOnly" {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    "implementation"("org.springframework.boot:spring-boot-starter-data-jdbc")
    "implementation"("org.springframework.boot:spring-boot-starter-data-jpa")
    "implementation"("org.springframework.boot:spring-boot-starter-jdbc")
    "implementation"("org.springframework.boot:spring-boot-starter-validation")
    "implementation"("org.springframework.boot:spring-boot-starter-web")
    "compileOnly"("org.projectlombok:lombok")
    "developmentOnly"("org.springframework.boot:spring-boot-devtools")
    "runtimeOnly"("org.postgresql:postgresql")
    "annotationProcessor"("org.springframework.boot:spring-boot-configuration-processor")
    "annotationProcessor"("org.projectlombok:lombok")
    "providedRuntime"("org.springframework.boot:spring-boot-starter-tomcat")
    "testImplementation"("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}