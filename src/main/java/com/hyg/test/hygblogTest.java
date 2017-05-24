package com.hyg.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*@RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。
用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。*/
@RequestMapping("/HYGBlog")
public class hygblogTest {

    /*访问路径为localhost:8080/HYGBlog/hi */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String SayHi(ModelMap modelMap) {
        modelMap.addAttribute("welcome", "HYGBlog Test");

        return "test";
    }
}
