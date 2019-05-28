package com.example.customer.service;

import com.example.customer.dao.UserMapper;
import com.example.customer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public HashMap<String, Object> queryById(int userid) {
        HashMap<String,Object> hashMap = new HashMap<>();
        User user = userMapper.query(userid);
        if(user == null){
            hashMap.put("retcode","111");
            hashMap.put("retdesc","查询失败，没有该用户");
        }else{
            hashMap.put("retcode","000");
            hashMap.put("retdesc","查询成功");
            hashMap.put("userinfo",user);
        }
        return hashMap;
    }

    @Override
    public String queryRetLevel(int userid) {
        return userMapper.query(userid).getUserLevel();
    }
}
