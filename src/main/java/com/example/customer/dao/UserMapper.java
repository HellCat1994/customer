package com.example.customer.dao;

import com.example.customer.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 查询消费者信息
     * @param userId
     * @return
     */
    @Results({
            @Result(property = "userId",column = "user_id"),
            @Result(property = "userName",column = "user_name"),
            @Result(property = "userLevel",column = "user_level")}
    )
    @Select("select * from t_demo_customer_s00504329 where user_id=#{userId}")
    User query(int userId);
}
