package com.bwj.controller;

import com.bwj.model.User;
import com.bwj.service.IUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wll
 * @Date 2019/4/6 11:14
 * @Version 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId=Long.parseLong(request.getParameter("id"));
        User user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }


    @RequestMapping("/traversalHashMap")
    public void TraversalHashMap()
    {

       HashMap hashMap =getHashMap();
       Iterator<Map.Entry<String,String>> iterator= hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> map = iterator.next();
            System.out.println("key: "+map.getKey()+" ====== value: "+map.getValue());
        }
    }

    public HashMap<String,String> getHashMap()
    {
        HashMap<String,String> hashMap=new LinkedHashMap<String, String>();
        hashMap.put("1","2019-4-13");
        hashMap.put("2","2019-4-12");
        hashMap.put("3","2019-4-15");
        hashMap.put("4","2019-4-16");
        hashMap.put("5","2019-4-17");

        hashMap.put("7","2019-4-19");
        hashMap.put("6","2019-4-18");
        hashMap.put("9","2019-4-21");
        hashMap.put("8","2019-4-20");

        return hashMap;
    }

}
