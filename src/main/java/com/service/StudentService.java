package com.service;

import com.pojo.PageBean;
import com.pojo.Student;

public interface StudentService {

    PageBean<Student> selectByPageAndCondition(int currentPage, int pageSize, Student student);

    void add(Student student);

    void deleteByIds(int[] ids);

    void deleteById(int id);

    void update(Student student);

}
