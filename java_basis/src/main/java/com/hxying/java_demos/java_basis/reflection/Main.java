package com.hxying.java_demos.java_basis.reflection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        System.out.println(aClass.getName());

        System.out.println(Arrays.toString(aClass.getAnnotations()));
        System.out.println(Arrays.toString(aClass.getFields()));
        System.out.println(Arrays.toString(aClass.getConstructors()));
        System.out.println(Arrays.toString(aClass.getMethods()));



    }
}
