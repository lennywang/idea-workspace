package com.xdclass.springboot.domain;

import java.util.Comparator;

/**
 *
 **/
public class Person  {
//implements Comparable
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person==false) return false;
        Person person=(Person) o;
        return this.name.equals(person.name)&&this.age==person.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    //    @Override
    //    public int compareTo(Object o) {
    //        if (o instanceof Person==false) return 0;
    //        Person person = (Person) o;
    //       int t= this.name.compareTo(person.name);
    //       if (t!=0) return t;
    //       return this.age-person.age;
    //    }
}

