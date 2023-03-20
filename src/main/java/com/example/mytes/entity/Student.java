package com.example.mytes.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String stu_name;
    private Integer stu_age;
    private String stu_sex;
    private String stu_class;
}


