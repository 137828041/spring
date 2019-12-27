package cn.itheima.controller;

import cn.domain.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/use")
public class UseController {
    @RequestMapping("/test11/{names}")
    //@PathVariable
    public  String test11(@PathVariable("names") String username){
        System.out.println("username");
        return "success";
    }
    @RequestMapping("/test1")
    public ModelAndView test1(ModelAndView modelAndView) {
        modelAndView.addObject("username", "张飒");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/test2")
    public String test2(HttpServletRequest request) {
        request.setAttribute("username", "李四");
        return "success";
    }

    @RequestMapping("/test3")
    public String test3(Model model) {
        model.addAttribute("username", "李四");
        return "success";
    }

    @RequestMapping("/test4")
    public String test4(Map map) {
        map.put("username", "王五");
        return "success";
    }

    @RequestMapping("/test5")
    @ResponseBody
    public List<User> test5() throws IOException {
        System.out.println("ajax请求");
        User u = new User(1, "nice");
        User u2 = new User(2, "吴迪");
        User u3 = new User(3, "lisi");
        List<User> list = new ArrayList<>();
        list.add(u);
        list.add(u2);
        list.add(u3);
        return list;

    }

    @RequestMapping("/test7")
    @ResponseBody
    public User test7(@RequestBody User user) {
        System.out.println("ajax请求...." + user.getUsername());
        return user;


    }
}
