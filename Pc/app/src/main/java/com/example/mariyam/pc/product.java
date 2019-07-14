package com.example.mariyam.pc;

public class product {

    int ID;
    String Name;
    int no;

    public product(int ID, String name, int no) {
        this.ID = ID;
        Name = name;
        this.no = no;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
