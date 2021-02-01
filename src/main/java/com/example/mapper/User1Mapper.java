package com.example.mapper;

import com.example.entity.User1;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @PROJECT_NAME: demo
 * @DESCRIPTION:
 * @USER: RanRan.zhang
 * @DATE: 2021/2/1 14:50
 */
@Repository
public interface User1Mapper {

     List<User1> getList();
}
