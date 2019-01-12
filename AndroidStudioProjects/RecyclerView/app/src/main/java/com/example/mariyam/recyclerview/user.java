package com.example.mariyam.recyclerview;

public class user {

   private String Name;
     private  String Age;

    public user() {
    }

    public user(String name, String age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}