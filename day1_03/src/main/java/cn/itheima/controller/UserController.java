package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/params")
public class UserController {
    @RequestMapping("/test")
    public  String test1(String username,Integer age,String hobby){
        System.out.println("1:"+username+"2:"+age+"3:"+hobby);
        return "success";
    }
}
