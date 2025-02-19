plugins {
    id("java")
    id("application")
}

version = "1.0-SNAPSHOT"

application {
    mainClass.set("ru.alexeySapunov.netty.server.Server")
}

dependencies {
    // https://mvnrepository.com/artifact/io.netty/netty-all
    implementation("io.netty:netty-all:4.1.70.Final")

    implementation(project(":common"))
}

repositories {
    mavenCentral()
}