package com.bwj.springsecurity.controller;

import com.bwj.springsecurity.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName SecurityController
 * @Description TODO
 * @Author wll
 * @Date 2019/4/5 23:58
 * @Version 1.0
 **/
@Controller
@RequestMapping("security")
public class SecurityController {

    @RequestMapping("/index")
    public String index(Model model){
        Msg msg =new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg",msg);
        return "home";
    }
}
