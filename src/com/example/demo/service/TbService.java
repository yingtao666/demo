package com.example.demo.service;

import com.example.demo.entity.tb;

public class TbService {
    @Autowired
    tbMapper tMapper;
    public void test(){
        System.out.println("测试");
    }
}