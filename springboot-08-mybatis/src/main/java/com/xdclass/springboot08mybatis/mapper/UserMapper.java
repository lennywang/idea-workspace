package com.xdclass.springboot08mybatis.mapper;

import com.xdclass.springboot08mybatis.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 **/
public interface UserMapper {

    @Insert("INSERT INTO USER(name,phone,create_time,age) VALUES(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int insert(User user);

    @Select("SELECT * FROM USER")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    List<User> findAll();

    @Select("SELECT * FROM USER WHERE id=#{id}")
    @Results({
            @Result(column = "create_time",property = "createTime")
    })
    User findById(Integer id);

    @Update("UPDATE USER SET name=#{name} WHERE id=#{id}")
    User update(User user);

    @Delete("DELETE FROM USER  WHERE id=#{id}")
    int delete(Integer id);

}
