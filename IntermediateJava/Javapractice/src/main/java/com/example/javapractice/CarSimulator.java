package com.example.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launcing Car simulator....");

        Car Honda =new Car("blue","Wood");

        System.out.println("Car having "+Honda.color +" color");

        System.out.println("The Car have "+Honda.getWheel()+ " Wheel");

        Car Myhonda =new Car(); //default constructor
        System.out.println(Car.color +" color and "+Myhonda.getMinterior());

        Car.color ="black";
        System.out.println("Myhonda color is "+Myhonda.color);
        System.out.println("Myhonda color is "+Honda.color);

    }
}
