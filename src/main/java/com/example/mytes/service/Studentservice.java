package com.example.mytes.service;

import com.example.mytes.entity.Student;

import java.util.List;

public interface Studentservice {

    List<Student> getOne(Integer id);

    List<Student> getAll();

    int insert(Student student);

    int updateOneById(Student student);

    int deleteOneById(Integer id);
}
