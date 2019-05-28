package com.example.customer.service;

import java.util.HashMap;

public interface UserService {
    HashMap<String,Object> queryById(int userid);
    String queryRetLevel(int userid);
}
