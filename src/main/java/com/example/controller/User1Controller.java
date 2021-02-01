package com.example.controller;

import com.example.entity.User1;
import com.example.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PROJECT_NAME: demo
 * @DESCRIPTION:
 * @USER: RanRan.zhang
 * @DATE: 2021/2/1 15:01
 */
@Controller
@RequestMapping("User1")
public class User1Controller {


    @Autowired User1Service user1Service;


    @RequestMapping(value = "getList",method = RequestMethod.GET)
    @ResponseBody
    public List<User1> getList(){

        return user1Service.getList();
    }
}
