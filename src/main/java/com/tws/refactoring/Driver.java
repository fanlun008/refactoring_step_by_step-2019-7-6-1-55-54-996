package com.tws.refactoring;

public class Driver {
    public static final Integer ADULT_LIMIT = 18;

    public int age;

    public int getAge() {
        return age;
    }
    public boolean isAdult() {return this.age >= 18;}

    public Driver(int age) {
        this.age = age;
    }
}
