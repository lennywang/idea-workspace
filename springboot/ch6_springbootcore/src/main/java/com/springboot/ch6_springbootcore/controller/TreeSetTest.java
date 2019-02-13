package com.springboot.ch6_springbootcore.controller;

import com.springboot.ch6_springbootcore.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.TreeSet;

@RestController
@RequestMapping("treeSet")
public class TreeSetTest {
    @RequestMapping("/test")
    public void test() {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("Hao LUO", 33));
        set.add(new Student("XJ WANG", 32));
        set.add(new Student("Bruce LEE", 60));
        set.add(new Student("Bob YANG", 22));
        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}
