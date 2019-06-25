package com.xdclass.springboot.controller;

import com.xdclass.springboot.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/treeset")
public class TreeSetController {

    @RequestMapping("/t1")
    public void test1() {

        TreeSet<Person> treeSet = new TreeSet<>(new K());
        treeSet.add(new Person("wang", 10));
        treeSet.add(new Person("wang", 20));
        treeSet.add(new Person("wang", 30));
        treeSet.add(new Person("wang", 10));

        treeSet.add(new Person("li", 10));
        treeSet.add(new Person("li", 21));
        treeSet.add(new Person("li", 20));


        treeSet.add(new Person("wu", 10));

        System.out.println(treeSet);
    }

    @RequestMapping("/t2")
    public void test2() {
        List<String> list = new ArrayList<String>();
        list.add("beijing");
        list.add("shanghai");
        list.add("hangzhou");
        //public static <T> void sort(List<T> list, Comparator<? super T> c)
        Collections.sort(list, new Comparator<String>() {
            public int compare(String str1, String str2) {
            /**
 　　　　　　* 升序排的话就是第一个参数.compareTo(第二个参数);
 　　　　　　* 降序排的话就是第二个参数.compareTo(第一个参数);
 　　　　　　*/

            // 按首字母升序排
            // return str1.compareTo(str2);
            // 按第二个字母升序排
                char c1 = str1.charAt(1);
                char c2 = str2.charAt(1);
                return c1 - c2;
            }
        });
        System.out.println(list);
    }
}

class K implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Person == false || o2 instanceof Person == false) return 0;
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        int i = p1.getName().compareTo(p2.getName());
        if (i != 0) return i;
        return p1.getAge() - p2.getAge();
    }
}
