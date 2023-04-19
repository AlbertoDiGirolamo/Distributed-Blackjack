plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation("io.javalin:javalin:5.1.3")
    implementation("org.slf4j:slf4j-simple:2.0.3")
    //implementation("io.javalin:javalin-openapi:4.6.7")

    annotationProcessor("io.javalin.community.openapi:openapi-annotation-processor:5.1.3")

    implementation("io.javalin.community.openapi:javalin-openapi-plugin:5.1.3") // for /openapi route with JSON scheme
    implementation("io.javalin.community.openapi:javalin-swagger-plugin:5.1.3") // for Swagger UI
    implementation("com.google.code.gson:gson:2.10")


    implementation(project(":bj-common"))
    implementation(project(":bj-presentation"))
}

application{
    mainClass.set("org.example.BlackjackService")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}