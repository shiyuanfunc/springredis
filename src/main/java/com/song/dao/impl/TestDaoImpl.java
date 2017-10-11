package com.song.dao.impl;

import com.song.bean.User;
import com.song.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/11.
 */
@Repository
public class TestDaoImpl implements TestDao {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private User user;
    @Override
    public void test() throws Exception{

        user.setName("lalal");
        user.setPhone("123456789");
        //保存对象时 采用 hash  因为hash采用的是jdk序列化（JdkSerializationRedisSerializer）
        redisTemplate.opsForHash().put("testt","test",user);
        Object o = redisTemplate.opsForHash().get("testt", "test");
        System.out.println(o.toString());

        //普通字符串采用  String  StringRedisSerializer序列化
        Object nam = redisTemplate.opsForValue().get("Test");
        System.out.println(nam.toString());
        System.out.println(redisTemplate);
    }
}
