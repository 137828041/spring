package cn.itcast.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("springMvc牛皮!");
        //request.getRequestDispatcher("/index.jsp").forward(request, response);

        ModelAndView mv= new ModelAndView();
      // mv.setViewName("index.jsp");
        mv.setViewName("index"); //将逻辑视图名称交给视图解析器：前缀+逻辑视图名称+后缀--/index.jsp
        mv.setViewName("success");
        return mv;

    }
}
