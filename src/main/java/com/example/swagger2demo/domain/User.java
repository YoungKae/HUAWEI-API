package com.example.swagger2demo.domain;

import java.io.Serializable;

/**
 * @program: swagger2-demo
 * @description: 用户测试类
 * @author: USTC
 * @create: 2018年12月01日
 **/

public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
