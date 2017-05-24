package com.hyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huang
 * 起始页面
 */
@Controller
public class WelcomeController {

    /**
     * 登陆之后直接跳转到欢迎页面
     * @return
     */
    @RequestMapping("/welcome")
    public String Welcome() {
        // prefix只定义到webpage，所以跳转的是否需要定义到具体的文件夹下面
        return  "welcome/welcome";
    }

}
