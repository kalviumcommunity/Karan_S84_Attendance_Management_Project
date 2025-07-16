 package com.school;
 class Student {
    String name;
    int studentId;

    public void setDetails(int id , String studentName){
        this.studentId = id;
        this.name = studentName;
    }
    public void displayDetails(){
        System.out.println("Student ID : " + this.studentId + ", Name: " + this.name); 
    }
}
