package com.huxx.api.controller;

import com.huxx.service.UserService;
import com.huxx.vo.CateVo;
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
}
