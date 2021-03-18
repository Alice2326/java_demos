package com.hxying.java_demos.java_basis.reflection;

public class User {
    private String name;
    private int age;

    String sex;

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

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User() {
        name = "undefined";
        age = 0;
        sex = "man";
    }
}
