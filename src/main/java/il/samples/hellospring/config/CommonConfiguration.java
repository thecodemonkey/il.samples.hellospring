package il.samples.hellospring.config;

import il.samples.hellospring.utils.VersionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    VersionUtils getVersionHolder(ApplicationContext context){
        return new VersionUtils(context);
    }
}
