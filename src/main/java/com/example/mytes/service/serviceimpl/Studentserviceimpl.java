package com.example.mytes.service.serviceimpl;

import com.example.mytes.entity.Student;
import com.example.mytes.mapper.Studentmapper;
import com.example.mytes.service.Studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Studentserviceimpl implements Studentservice {

    @Autowired
    Studentmapper studentmapper;

    @Override
    public List<Student> getOne(Integer id) {
        return studentmapper.getOne(id);
    }



    @Override
    public List<Student> getAll() {
        return studentmapper.getAll();
    }

    @Override
    public int insert(Student student) {
        return studentmapper.insert(student);
    }

    @Override
    public int updateOneById(Student student) {
        return studentmapper.updateOneById(student);
    }

    @Override
    public int deleteOneById(Integer id) {
        return studentmapper.deleteOneById(id);
    }
}
