package com.song.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/11.
 */
@Component
public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    private String name ;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
