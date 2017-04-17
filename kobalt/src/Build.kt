import com.beust.kobalt.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.publish.*

val kotlin_version = "1.1.1"

val p = project {
    name = "getoptk"
    group = "com.empower"
    artifactId = name
    version = "0.2"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version",
            "com.google.guava:guava:19.0")
    }

    dependenciesTest {
        compile("junit:junit:4.11",
            "org.assertj:assertj-core:3.5.2")
    }

    assemble {
        jar {
        }
    }

    bintray {
        publish = true
    }
}
