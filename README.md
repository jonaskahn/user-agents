# user-agents
Small library random user-agent for jvm - Written in Kotlin 

# 
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
```java
import one.ifelse.tools.useragent.RandomUserAgent;

public class Example() {
    public static void main(String[] args) {
        
        var randomAgent = RandomUserAgent.random();
        
        var randomDesktopAgent = RandomUserAgent.desktop();
        
        var randomMobileAgent = RandomUserAgent.mobile();
    }
}
```
