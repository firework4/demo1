package com.example.mytes.mapper;

import com.example.mytes.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Studentmapper {
    List<Student> getOne(Integer id);

    List<Student> getAll();

    int insert(Student student);

    int updateOneById(Student student);

    int deleteOneById(Integer id);
}
