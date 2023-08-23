package com.example.dmojpa2308.repositories;

import com.example.dmojpa2308.data.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByFirstNameStartsWith(String s);

}
