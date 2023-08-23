package com.example.dmojpa2308;

import com.example.dmojpa2308.data.Student;
import com.example.dmojpa2308.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Dmojpa2308Application {

    public static void main(String[] args) {
        SpringApplication.run(Dmojpa2308Application.class, args);
    }

    @Bean
    public CommandLineRunner run(StudentRepository repository) {
        return (args) -> {
            //addStudents(repository);

            //repository.findAll().forEach(System.out::println);

            repository.findByFirstNameStartsWith("Ja").forEach(System.out::println);
        };
    }

    private void addStudents(StudentRepository repository) {
        repository.save(new Student("John", "Dow", 20));
        repository.save(new Student("Jane", "Bird", 21));
        repository.save(new Student("Kate", "Wing", 19));
        repository.save(new Student("Jack", "Small", 21));
    }
}
