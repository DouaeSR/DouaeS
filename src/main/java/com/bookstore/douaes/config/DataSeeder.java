package com.bookstore.douaes.config;

import com.bookstore.douaes.model.User;
import com.bookstore.douaes.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.count() == 0) {
                User admin = User.builder()
                        .email("admin@mail.com")
                        .passwordHash(passwordEncoder.encode("1234"))
                        .role(User.Role.ADMIN)
                        .build();

                User user = User.builder()
                        .email("user@mail.com")
                        .passwordHash(passwordEncoder.encode("1234"))
                        .role(User.Role.USER)
                        .build();

                userRepository.save(admin);
                userRepository.save(user);

                System.out.println(" Users seeded: ADMIN and USER");
            }
        };
    }
}
