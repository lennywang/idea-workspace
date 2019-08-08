package com.xdclass.ch06_atomic;

import javax.sound.midi.Soundbank;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 **/
public class ch6_5_AtomicReference {
    public static void main(String[] args){
        AtomicReference<Person> studentAtomicReference = new AtomicReference<>();
        Person student1 = new Person(1, "wll");
        Person student2 = new Person(2, "xh");
        studentAtomicReference.set(student1);
        studentAtomicReference.compareAndSet(student1,student2);
        Person student = studentAtomicReference.get();
        System.out.println(student.getName());
    }
}

class Person{
    private long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
