package com.example.javapractice;

public class Car {
   public  static String color ="red";
   private String wheel ="3";
   private String interior;

   public Car(){
    interior ="leather";
   }

   public Car( String mcolor,String minterior )
   {
       color=mcolor;
       interior=minterior;
   }
    public String getWheel() {
        return wheel;
    }

    public String getMinterior() {
        return interior;
    }
}
