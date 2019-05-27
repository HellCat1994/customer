package com.example.customer.controller;
import com.example.customer.dao.UserMapper;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestSchema(schemaId = "customer_t")
@RequestMapping(path = "/huaweicloud")
public class Customer {
    @Autowired
    private UserMapper userMapper;
    @GetMapping(path = "/user")
    public String hello() {
        return userMapper.query(1).getUserName();
    }
}

