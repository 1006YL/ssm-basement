package com;

import com.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com");
public class javacon {
    @Bean
    public User user(){
        return new User();
    }
}
