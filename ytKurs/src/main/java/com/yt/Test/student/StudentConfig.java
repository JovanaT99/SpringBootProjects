package com.yt.Test.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student jovana=new Student(
                    "Jovana",
                    "jovanablagojevic98@gmail.com",
                    LocalDate.of(1999, 7, 12)
            );
            Student mariam=new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, 7, 12)

            );

            repository.saveAll(
                    List.of(jovana,mariam)
            );
        };
    }
}
