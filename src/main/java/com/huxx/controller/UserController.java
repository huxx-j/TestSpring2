package com.huxx.controller;

import com.huxx.service.UserService;
import com.huxx.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/reg")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String reg () {

        return "joinform";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add (@ModelAttribute UserVo userVo, Model model) {
        userService.add(userVo);
        model.addAttribute("info", userService.get(userVo));
        return "done";
    }

    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String loginForm () {
        return "login";
    }

    @RequestMapping(value = "/cate", method = RequestMethod.GET)
    public String categoryEdit () {
        return "cartex";
    }



}
