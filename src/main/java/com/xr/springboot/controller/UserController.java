package com.xr.springboot.controller;

import com.google.gson.Gson;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xr.springboot.model.User;
import com.xr.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

   /* @RequestMapping("/all")
    public ModelAndView all(){
        ModelAndView mv=  new ModelAndView();
        List<User> all = userService.all();
        mv.addObject("user",all);
        mv.setViewName("success");

        return mv;
    }*/

    @RequestMapping("/all")
    public String all(){
        List<User> all = userService.all();
        for (User user : all) {
            System.out.println(user);
        }
        Gson g = new Gson();
        String s = g.toJson(all);
        System.out.println(s);
        return s;
    }
}
