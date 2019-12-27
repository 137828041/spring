package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv= new ModelAndView();
        System.out.println("执行findAll");
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/save")
    public  String save(){
        System.out.println("执行save");
       // return "forward:/user/findAll";
        return "redirect:/user/findAll";
    }
}
