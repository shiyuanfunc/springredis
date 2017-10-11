package com.song.controller;

import com.song.bean.User;
import com.song.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/10/11.
 */
@Controller
@Scope("prototype")
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao testDao;


    @RequestMapping("/test")
    public void test() throws Exception {
        testDao.test();
        System.out.println("test over");
    }
}
