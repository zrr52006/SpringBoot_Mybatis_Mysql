package com.example.service.impl;

import com.example.entity.User1;
import com.example.mapper.User1Mapper;
import com.example.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME: demo
 * @DESCRIPTION:
 * @USER: RanRan.zhang
 * @DATE: 2021/2/1 14:58
 */
@Service
public class User1ServiceImpl implements User1Service {
    @Autowired User1Mapper user1Mapper;
    @Override
    public List<User1> getList() {
        return user1Mapper.getList();
    }
}
