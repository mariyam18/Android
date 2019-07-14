package com.example.mariyam.frostyy;

public class User {

    String Name;
    String Number;
    String Dish;
    String Hotel;
    String Add1;
    String Add2;
    String Landmark;
    String Pincode;

    public User(String name, String number, String dish, String hotel, String add1, String add2, String landmark, String pincode) {
        Name = name;
        Number = number;
        Dish = dish;
        Hotel = hotel;
        Add1 = add1;
        Add2 = add2;
        Landmark = landmark;
        Pincode = pincode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getDish() {
        return Dish;
    }

    public void setDish(String dish) {
        Dish = dish;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }

    public String getAdd1() {
        return Add1;
    }

    public void setAdd1(String add1) {
        Add1 = add1;
    }

    public String getAdd2() {
        return Add2;
    }

    public void setAdd2(String add2) {
        Add2 = add2;
    }

    public String getLandmark() {
        return Landmark;
    }

    public void setLandmark(String landmark) {
        Landmark = landmark;
    }

    public String getPincode() {
        return Pincode;
    }

    public void setPincode(String pincode) {
        Pincode = pincode;
    }

    public User() {
    }
}
