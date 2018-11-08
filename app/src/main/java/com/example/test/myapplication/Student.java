package com.example.test.myapplication;

public class Student {
    private int rollno;
    String name;
    String email_id;
    int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Student(int rollno, String name, String email_id) {
        this.rollno = rollno;
        this.name = name;
        this.email_id = email_id;
        image = 0;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
}
