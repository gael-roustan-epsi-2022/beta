package com.betflix.beta;

public class Profile {
    private final String name;
    private final int age;
    private final int id;

    public Profile(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
