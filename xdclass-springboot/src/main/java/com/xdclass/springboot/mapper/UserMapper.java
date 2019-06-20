package com.xdclass.springboot.mapper;

import com.xdclass.springboot.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 *
 **/
public interface UserMapper {

    @Insert("INSERT INTO xdclass_user(NAME,phone,create_time,age) VALUES(#{name},#{phone},#{datetime},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public int add(User user);
}
