package com.example.customer.controller;
import com.example.customer.service.UserService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
@RestSchema(schemaId = "customer_t")
@RequestMapping(path = "/hwclouds/v1")
public class Customer {
    @Autowired
    private UserService userService;
    /**
     * 查询租户信息
     * @param userid
     * @return
     */
    @GetMapping(path = "/customer/{userid}")
    public HashMap<String,Object> queryById(@PathVariable(value = "userid") int userid) {
        return userService.queryById(userid);
    }
    /**
     * 提供给resource微服务进行调用
     * @param userid
     * @return
     */
    @GetMapping(path = "/customerid/{userid}")
    public String queryRetLevel(@PathVariable(value = "userid") int userid) {
        return userService.queryRetLevel(userid);
    }
}

