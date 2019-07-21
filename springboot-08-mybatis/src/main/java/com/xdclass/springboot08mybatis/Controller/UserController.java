package com.xdclass.springboot08mybatis.Controller;

import com.xdclass.springboot08mybatis.domain.JsonData;
import com.xdclass.springboot08mybatis.domain.User;
import com.xdclass.springboot08mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 *
 **/
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    private JsonData add(){
        User u =new User();
        u.setName("王路路");
        u.setPhone("18516800306");
        u.setCreateTime(new Date());
        u.setAge(30);
        int id = userService.add(u);
        return JsonData.buildSuccess(id);
    }

    @RequestMapping("find_all")
    private JsonData findAll(){
        List<User> userList = userService.findAll();
        return  JsonData.buildSuccess(userList);
    }

    @RequestMapping("find_by_id")
    private JsonData findById(Integer id){
        User user = userService.findById(id);
        return JsonData.buildSuccess(user);
    }

    @RequestMapping("/update")
    private JsonData update(Integer id,String name){
        User user=new User();
        user.setId(id);
        user.setName(name);
        user = userService.update(user);
        return JsonData.buildSuccess(user);
    }

    @RequestMapping("/delete")
    private JsonData delete(Integer id){
        Integer integer = userService.delete(id);
        return JsonData.buildSuccess(integer);
    }

}
