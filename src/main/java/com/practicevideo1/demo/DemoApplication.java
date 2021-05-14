package com.practicevideo1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @GetMapping
//    public String hello() {
//        return "Hello World";
//    }

//    @GetMapping
//    public List<String> helloPeople() {
//        return List.of("Hello", "World");
//    }
//
//    @GetMapping
//    public List<StudentModel> hello() {
//        return List.of (
//                new StudentModel (
//                        1L,
//                        "Mary",
//                        "maryj@gmail.com",
//                        LocalDate.of(2000, Month.JANUARY, 7),
//                        21
//                )
//        );
    }

