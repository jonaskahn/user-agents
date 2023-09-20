# user-agents
Small library random user-agent for jvm - Written in Kotlin 

## update maven
```maven
    <repositories>
        <repository>
            <id>user-agents-repo</id>
            <url>https://maven.pkg.github.com/jonaskahn/user-agents</url>
        </repository>
    </repositories>
    
    
    <dependencies>
        <dependency>
            <groupId>one.ifelse.tools</groupId>
            <artifactId>user-agents</artifactId>
            <version>0.0.1</version>
        </dependency>
    </dependencies>
```
--------

## Sample
```kotlin
fun main() {
    RandomUserAgent.random()

    RandomUserAgent.desktop(deviceType = DeviceType.MACOS)

    RandomUserAgent.desktop(deviceType = DeviceType.LINUX)

    RandomUserAgent.desktop(deviceType = DeviceType.WINDOWS)

    RandomUserAgent.desktop(deviceType = DeviceType.MACOS, browserType = BrowserType.SAFARI)

    RandomUserAgent.desktop(deviceType = DeviceType.LINUX, browserType = BrowserType.FIREFOX)

    RandomUserAgent.desktop(deviceType = DeviceType.WINDOWS, browserType = BrowserType.CHROME)

    RandomUserAgent.mobile(deviceType = DeviceType.IOS)

    RandomUserAgent.mobile(deviceType = DeviceType.ANDROID)
    
    RandomUserAgent.mobile(deviceType = DeviceType.IOS, browserType = BrowserType.SAFARI)

    RandomUserAgent.mobile(deviceType = DeviceType.ANDROID, browserType = BrowserType.CHROME)
}
```
