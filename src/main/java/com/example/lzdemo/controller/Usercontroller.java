package com.example.lzdemo.controller;

import com.example.lzdemo.dao.UserRepossity;
import com.example.lzdemo.domain.trade;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {
    @Resource
    private UserRepossity userRepossity;

    @RequestMapping("/test2")
    public List<trade>  getUser(Integer id){
        List<trade> b = userRepossity.getall();

        return userRepossity.getall();

    }
}
