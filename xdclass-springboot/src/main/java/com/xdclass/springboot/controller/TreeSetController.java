package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/treeset")
public class TreeSetController {

    @RequestMapping("/t1")
    public void test1(){

        TreeSet<Person> treeSet = new TreeSet<>(new K());
        treeSet.add(new Person("wang",10));
        treeSet.add(new Person("wang",20));
        treeSet.add(new Person("wang",30));
        treeSet.add(new Person("wang",10));

        treeSet.add(new Person("li",10));
        treeSet.add(new Person("li",21));
        treeSet.add(new Person("li",20));


        treeSet.add(new Person("wu",10));

        System.out.println(treeSet);
    }


}
class K implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Person==false||o2 instanceof  Person==false)return 0;
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        int i = p1.getName().compareTo(p2.getName());
        if (i!=0) return i;
        return p1.getAge()-p2.getAge();
    }
}
