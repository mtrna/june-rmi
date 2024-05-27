# June-RMI

Spring remoting/RMI had been deprecated in Spring 5.3 and removed in Spring 6.
This library is drop-in substitution for the lost functionality.
Migration steps:

1. Add import to your `pom.xml`:
```xml
<dependency><groupId>org.juneframework</groupId><artifactId>org.juneframework.june-rmi</artifactId><version>5.3.36</version></dependency>
```

2. Replace `org.springframework.remoting.*` imports in your `.java` files, e.g.: 
```java
import org.springframework.remoting.RemoteAccessException;
```

```java
import org.juneframework.remoting.RemoteAccessException;
```

Functionality of `june-rmi` was tested in Spring 5.x and Spring 6.x.

Spring ends in June, hence the name.