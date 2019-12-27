package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/date")
public class DateController {
    @RequestMapping("/test1")
    public String test1(Date time1,Date time2){
        System.out.println(time1);
        System.out.println(time2);
        return "success";
    }
}
