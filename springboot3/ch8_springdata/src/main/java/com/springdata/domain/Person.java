package com.springdata.domain;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @ClassName Person
 * @Description Person
 * @Author wll
 * @Date 2019/3/17 9:44
 * @Version 1.0
 **/

//指定这是一个和数据表映射的实体类
@Entity
//@NamedQuery(name = "Person.withNameAndAddressNamedQuery",query = "select p from Person p where p.name=?1 and p.address=?2")
public class Person {
    @Id//指明这个属性映射为数据库的主键
    @GeneratedValue(strategy = GenerationType.AUTO)//注解默认使用主键生成方式为自增，Hibernate为我们自动生成一个名为HIBERBATE_SEQUENCE的序列。
    private Long id;

    private String name;

    private Integer age;

    private String address;

    public Person() {
    }

    public Person(Long id,String name, Integer age, String address) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
