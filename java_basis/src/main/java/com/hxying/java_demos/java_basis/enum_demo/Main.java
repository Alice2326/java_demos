package com.hxying.java_demos.java_basis.enum_demo;

public class Main {
    public static void main(String[] args) {
        var weekday = Weekday.FRI;
        // 1. 枚举类是引用类型，为什么可以使用==？
        System.out.println(weekday == Weekday.FRI); //true
        System.out.println(weekday.name()); // FRI
        // 最好别使用ordinal()，如果修改了枚举的顺序，编译器无法检查出错误。
        System.out.println(weekday.ordinal()); // 4

        var weekday1 = Weekday1.FRI;
        System.out.println(weekday1.name()); // FRI
        System.out.println(weekday1.ordinal()); // 4
        System.out.println(weekday1.dayValue); // 5





    }
}

enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

enum Weekday1 {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    // 可以不是final（可以在运行时修改），但是不推荐
    public final int dayValue;

    // 可以不加private,编译器会自动加上
    private Weekday1(int dayValue){
        this.dayValue = dayValue;
    }
}



