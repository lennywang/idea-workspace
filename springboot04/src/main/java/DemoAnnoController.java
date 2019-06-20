import domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName DemoAnnoController
 * @Description TODO
 * @Author wll
 * @Date 2019/6/7 20:04
 * @Version 1.0
 **/

//注解演示控制器
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url："+request.getRequestURL()+" can access";
    }

    @RequestMapping(value = "/pathvar/{string}",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String string, HttpServletRequest request){
        return "url："+request.getRequestURL()+" can access,string："+string;
    }

    @RequestMapping(value = "/requestParam",produces ="text/plain;charset=UTF-8" )
    public @ResponseBody String passRequestParam(Long id,HttpServletRequest request){
        return "url："+request.getRequestURL()+" can access,id："+id;
    }

    @RequestMapping(value = "/obj",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public  String passObj(DemoObj obj,HttpServletRequest request){
        return "url："+request.getRequestURL()+" can access,obj id："+obj.getId()+" ,obj name："+obj.getName();
    }

    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain,charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url："+request.getRequestURL()+" can access";
    }
}
