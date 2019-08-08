package com.xdclass.ch06_atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 *
 **/
public class ch6_4_AtomicLongFieldUpater {
    public static void main(String[] args) {
        AtomicLongFieldUpdater<Student> longFieldUpdater = AtomicLongFieldUpdater.newUpdater(Student.class, "id");

        Student xdclass = new Student(1L, "xdclass");
        longFieldUpdater.compareAndSet(xdclass,1L,100L);
        System.out.println("id= "+xdclass.getId());

        AtomicReferenceFieldUpdater<Student, String> referenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Student.class, String.class, "name");
        referenceFieldUpdater.compareAndSet(xdclass,"xdclass","lenny");
        System.out.println("name= "+xdclass.getName());
    }
}

class Student {
    volatile long id;
    volatile String name;

    public Student(long id, String name) {
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
