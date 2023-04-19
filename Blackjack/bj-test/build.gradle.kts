plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.testng:testng:7.1.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    dependencies {
        //testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")

    }

    /*implementation("io.javalin.community.openapi:javalin-openapi-plugin:5.1.3") // for /openapi route with JSON scheme
    implementation("io.javalin.community.openapi:javalin-swagger-plugin:5.1.3") // for Swagger
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.slf4j:slf4j-simple:2.0.3")
    annotationProcessor("io.javalin.community.openapi:openapi-annotation-processor:5.1.3")*/

    implementation(project(":bj-client"))
    implementation(project(":bj-server"))
    implementation(project(":bj-common"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}