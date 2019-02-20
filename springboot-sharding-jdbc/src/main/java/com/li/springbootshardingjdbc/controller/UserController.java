package com.li.springbootshardingjdbc.controller;/**
 * @author lihaodong
 * @create 2018-11-15 14:44
 * @desc
 **/

import com.li.springbootshardingjdbc.dao.UserMapper;
import com.li.springbootshardingjdbc.model.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**

 * @author lihaodong

 * @create 2018-11-15 14:44

 * @desc

 **/
@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/select")
    public List<UserVo> select(){

        return userMapper.selectUser();
    }

    @GetMapping("/insert")
    public Boolean insert(UserVo userVo){
        return userMapper.insertUser(userVo);
    }

}
