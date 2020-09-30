# simple spring boot application 

A simple spring boot application including exception handling and database access using JPA and H2 in memory Database

## requirements

- jdk    v. > 11
- maven  v. > 3.6.x

## installation

    git clone https://github.com/thecodemonkey/il.samples.hellospring.git
    mvn clean package
    mvn spring-boot:run
    
open in browser:
   
   http://localhost:8080
   
in your browser you should see the following:
   
   **hello spring!**
   
## test data

When the application is started, test data is automatically loaded into the H2 database:

org.springframework.context.annotation.Configuration.JPAConfiguration

```java
@Configuration
public class JPAConfiguration {

    @Bean
    public ApplicationRunner initializer(UserRepository users) {
        return args -> users.saveAll(Arrays.asList(
                UserEntity.builder().name("Jeff").age(10).build(),
                UserEntity.builder().name("Jimm").age(12).build(),
                UserEntity.builder().name("John").age(15).build()
        ));
    }
}
```

## lombok

The example uses lombok, which brings a lot of magic ;-)
https://projectlombok.org/
