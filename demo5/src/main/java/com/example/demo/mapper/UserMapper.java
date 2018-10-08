package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO userinfo(user_name) VALUES(#{user_name})")
    void insert(@Param("user_name") String user_name);

    @Select("SELECT * FROM userinfo WHERE user_name=#{user_name}")
    UserEntity select(@Param("user_name") String user_name);
}
