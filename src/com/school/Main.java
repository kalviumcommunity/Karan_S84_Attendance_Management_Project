package com.school;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setDetails(88 , "Sir-Jadeja");
        Student s2 = new Student();
        s2.setDetails(69, "Viv-Siraj-Official");
       Course c1 = new Course();
       c1.setDetails(11, "OOPS");
       Course c2 = new Course();
       c2.setDetails(23, "AI-M.L");
       Course [] arr1 = {c1 , c2};
       Student [] arr2 = {s1 , s2};
       System.out.println("Registered Students: ");
       for(Student s : arr2) s.displayDetails();
       System.out.println("Course Details: ");
       for(Course c : arr1) c.displayDetails();
        }
}