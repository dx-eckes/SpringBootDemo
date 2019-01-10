package com.example.SpringBootDemo.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel
public class TestUser {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private int age;
    @ApiModelProperty("生日")
    private Date birthday;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
