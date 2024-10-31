# user-agents

Small library random user-agent for jvm - Written in Kotlin

## update maven

```maven
    
    <dependencies>
        <dependency>
            <groupId>one.ifelse.tools</groupId>
            <artifactId>user-agents</artifactId>
            <version>0.1.0</version>
        </dependency>
    </dependencies>
```

--------

## Note

> Since v0.1.0, I switched to the new implementation, seed data now from [js version of
`user-gents`](https://www.npmjs.com/package/user-agents) as seeds but not any lines of
> codes.

## Sample

```kotlin
// Kotlin example

fun main() {

    RandomUserAgent.random()

    // platform
    RandomUserAgent.random(listOf { it.platform == "Win32" })
    RandomUserAgent.random(listOf { it.platform == "MacIntel" })

    // device type
    RandomUserAgent.random(listOf { it.deviceCategory == "desktop" })
    RandomUserAgent.random(listOf { it.deviceCategory == "mobile" })
    RandomUserAgent.random(listOf { it.deviceCategory == "tablet" })

    // brower type
    RandomUserAgent.random(listOf { it.userAgent.contains("Safari", true) })
}
```

```java
// Java example

public class Main {

    public static void main(String[] args) {
    }
}
```
