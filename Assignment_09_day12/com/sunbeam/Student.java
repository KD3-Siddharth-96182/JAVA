package com.sunbeam;

class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}