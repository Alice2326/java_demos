package com.hxying.java_demos.genericity_demo;

public class InfoHelper {

    static int add(Info<? extends Person> i){
        return 1;
    }
}
