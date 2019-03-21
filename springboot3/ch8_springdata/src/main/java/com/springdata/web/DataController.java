package com.springdata.web;

import com.springdata.dao.PersonDao;
import com.springdata.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DataController
 * @Description TODO
 * @Author wll
 * @Date 2019/3/17 10:05
 * @Version 1.0
 **/
@RestController
public class DataController {

    @Autowired
    PersonDao personDao;

    @RequestMapping("/save")
    public Person save(String name,String address,Integer age){
        Person person= personDao.save(new Person(null,name,age,address));
        return person;
    }

    @RequestMapping("/q1")
    public List<Person> ql(String address){
        List<Person> list=personDao.findByAddress(address);
        return list;
    }

    @RequestMapping("/q2")
    public Person q2(String name,String address)
    {
        Person person=personDao.findByNameAndAddress(name,address);
        return person;
    }

    @RequestMapping("/q3")
    public Person q3(String name,String address)
    {
        Person person=personDao.withNameAndAddressQuery(name, address);
        return  person;
    }

    @RequestMapping("/q4")
    public Person q4(String name,String address)
    {
        Person person=personDao.withNameAndAddressNamedQuery(name, address);
        return  person;
    }

    @RequestMapping("/sort")
    public List<Person> sort(){
        List<Person> people =personDao.findAll(new Sort(Sort.Direction.ASC,"age"));
        return  people;
    }

    @RequestMapping("/page")
    public Page<Person>page()
    {
        Page<Person> pagePeople=personDao.findAll(new PageRequest(1,2));
        return pagePeople;
    }
}
