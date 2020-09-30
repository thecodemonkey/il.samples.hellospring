package il.samples.hellospring.config;

import il.samples.hellospring.data.UserEntity;
import il.samples.hellospring.data.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

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


