package com.xdclass.springboot04exception.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *
 **/
@RestControllerAdvice
public class CustomExceptionHandler {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request){
        LOGGER.error("url{} ,msg{}",request.getRequestURL(),e.getMessage());

        Map<String,Object> map =new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value = MyException.class)
    Object handleException(MyException e,HttpServletRequest request)
    {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error.html");
//        modelAndView.addObject("msg",e.getMessage());
//        return modelAndView;

        Map<String,Object> map =new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }

}
