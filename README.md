# user-agents

Small library random user-agent for jvm - Written in Kotlin

## update maven

```maven

    <dependencies>
        <dependency>
            <groupId>one.ifelse.tools</groupId>
            <artifactId>user-agents</artifactId>
            <version>0.1.1</version>
        </dependency>
    </dependencies>
```

---

## Note

> Since v0.1.0, I switched to the new implementation, seed data now from [js version of
`user-gents`](https://www.npmjs.com/package/user-agents), but not any lines of
> code.

## Sample

```kotlin
// Kotlin example

fun main() {

    RandomUserAgent.random()

    // platform
    RandomUserAgent.random { it.platform == "Win32" }
    RandomUserAgent.random { it.platform == "MacIntel" }

    // device type
    RandomUserAgent.random { it.deviceCategory == "desktop" }
    RandomUserAgent.random { it.deviceCategory == "mobile" }
    RandomUserAgent.random { it.deviceCategory == "tablet" }

    // browser type
    RandomUserAgent.random { it.userAgent.contains("Safari", true) }

    // multiple filter
    RandomUserAgent.random({ it.platform == "Win32" }, { it.userAgent.contains("Mozilla", true) })
}
```

```java
// Java example

public class Main {

    public static void main(String[] args) {

        RandomUserAgent.INSTANCE.random();

        // platform
        RandomUserAgent.INSTANCE.random(userAgent -> Objects.equals(userAgent.getPlatform(), "Win32"));
        RandomUserAgent.INSTANCE.random(userAgent -> Objects.equals(userAgent.getPlatform(), "MacIntel"));

        // device type
        RandomUserAgent.INSTANCE.random(userAgent -> Objects.equals(userAgent.getDeviceCategory(), "desktop"));
        RandomUserAgent.INSTANCE.random(userAgent -> Objects.equals(userAgent.getDeviceCategory(), "mobile"));
        RandomUserAgent.INSTANCE.random(userAgent -> Objects.equals(userAgent.getDeviceCategory(), "tablet"));

        // browser type
        RandomUserAgent.INSTANCE.random(userAgent -> userAgent.getUserAgent().contains("Safari"));

        // multiple filter
        RandomUserAgent.INSTANCE.random(
                userAgent -> Objects.equals(userAgent.getDeviceCategory(), "mobile"),
                userAgent -> userAgent.getUserAgent().contains("Mozilla")
        );
    }
}
```