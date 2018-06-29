package com.huxx.api.controller;

import com.huxx.service.UserService;
import com.huxx.vo.CateVo;
import com.huxx.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/api", method = RequestMethod.GET)
public class ApiController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/getuserinfo", method = RequestMethod.POST)
    public List<UserVo> getUserInfo(){
        List<UserVo> list = userService.getUserInfo();
        for (UserVo tmp : list) {
            System.out.print(tmp.toString());
        }

        return list;
    }

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public List<CateVo> get() {
        return userService.cate();
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public int update(@RequestParam("enrolledOrder") String enrolledOrder) {
    public int update(@RequestParam("enrolledOrder") String enrolledOrder, @RequestParam("standbyOrder") String standbyOrder) {
//        System.out.println(123);
        System.out.println(enrolledOrder);
        System.out.println(standbyOrder);
        return userService.update(enrolledOrder, standbyOrder);
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(String title) {
        if (userService.addCate(title)>0) {
            return title;
        } else {
            return "SaVeFaIl";
        }
    }
}
