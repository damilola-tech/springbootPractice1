package com.practicevideo1.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student mary = new Student(
                    "Mary",
                    "maryj@gmail.com",
                    LocalDate.of(2000, Month. JANUARY, 7)
            );

            Student ay = new Student(
                    "Ay",
                    "ay@gmail.com",
                    LocalDate.of(1999, Month. JANUARY, 7)
            );

            Student lekwa = new Student(
                    "Lekwa",
                    "lekwa@gmail.com",
                    LocalDate.of(1995, Month. JANUARY, 7)
            );

            studentRepository.saveAll(
                    List.of(mary, ay, lekwa)
            );
        };
    }
}
