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

    implementation("com.google.code.gson:gson:2.10")

    implementation(project(":bj-common"))
    implementation(project(":bj-presentation"))
}
application{
    mainClass.set("org.example.BlackjackClient")
}
tasks.withType<JavaExec>() {
    standardInput = System.`in`
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}