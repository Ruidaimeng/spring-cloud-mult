package com.imooc.cloud.client.model;/*
 * Description
 *@author Ruimeng
 *@Date 2018/10/12 13:50
 */

public class User {
    private String  name ;
    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
