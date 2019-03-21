package com.springdata.dao;

import com.springdata.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @ClassName PersonDao
 * @Description TODO
 * @Author wll
 * @Date 2019/3/17 9:51
 * @Version 1.0
 **/
public interface PersonDao extends JpaRepository<Person,Long> {
    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name= :name and p.address= :address")
    Person withNameAndAddressQuery(@Param("name")String name,@Param("address")String address);

    Person withNameAndAddressNamedQuery(String name,String address);
}
