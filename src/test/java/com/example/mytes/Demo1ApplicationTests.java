package com.example.mytes;

import com.example.mytes.entity.Student;
import com.example.mytes.service.serviceimpl.Studentserviceimpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@MapperScan("com.example.mytes.mapper")
@SpringBootTest
class Demo1ApplicationTests {
    @Autowired
    Studentserviceimpl studentserviceimpl;
    
    @Test
    void insert1() {
        Student student = new Student();
        student.setId(9);
        student.setStu_name("修L2");
        student.setStu_age(6);
        student.setStu_sex("男");
        student.setStu_class("一班");

        int result = studentserviceimpl.insert(student);
        System.out.println("插入成功的记录数：" + result);
    }
    
    @Test
    void delete1(){

        int result = studentserviceimpl.deleteOneById(2);
        System.out.println("删除成功的记录数：" + result);
    }

    @Test
    void change(){
        Student student = new Student();

        List<Student> one = studentserviceimpl.getOne(2);
        System.out.println("修改前的数据:"+one);

        student.setId(2);//搜索
        student.setStu_class("二班");//更改

        int result = studentserviceimpl.updateOneById(student);//更改
        List<Student> two = studentserviceimpl.getOne(2);

        System.out.println("修改后的数据:"+two);
        System.out.println("更改成功的记录数：" + result);
        }

    
    @Test
    void selectone(){
        List<Student> one = studentserviceimpl.getOne(2);
        System.out.println(one);
    }
    
    @Test
    void selectall(){
        List<Student> all = studentserviceimpl.getAll();
        System.out.println(all);
    }
    
    
}
