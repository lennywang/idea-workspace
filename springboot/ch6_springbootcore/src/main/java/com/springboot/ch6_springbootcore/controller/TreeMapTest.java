package com.springboot.ch6_springbootcore.controller;

import com.springboot.ch6_springbootcore.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("treeMap")
public class TreeMapTest {
    @RequestMapping("test")
    private void test() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Hao LUO", 33));
        list.add(new Student("XJ WANG", 32));
        list.add(new Student("Bruce LEE", 60));
        list.add(new Student("Bob YANG", 22));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Student student : list) {
            System.out.println(student);
        }

    }
}
