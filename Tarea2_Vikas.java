package com.oop;

public class Tarea2_Vikas {

    public static void main(String[] args) {

        Student stu1 = new Student("jamie","654123456");

        Student stu2 = new Student("ella","123121234");

        Student stu3 = new Student("esmie","098765678");



        stu1.enroll("Math151");

        stu1.enroll("Eng255");

        stu1.enroll("Sci250");

        stu1.checkBalance();

        stu1.showCourse();

        stu1.payTution(600);

        stu1.checkBalance();

        System.out.println(stu1.toString());

        stu2.enroll("Mar123");

    }

}

class Student{

    private static int iD = 1000;

    private String userId;

    private String name;

    private String ssn;

    private String email;

    private String phone;

    private String city;

    private String state;

    private String course = "";

    private static final int costOfCourse = 800;

    private int balance=0;

    public Student(String name, String ssn) {

        iD++;

        this.name = name;

        this.ssn = ssn;

        setUserId();

        setEmail();

    }

    public String getPhone() {

        return phone;

    }



    public void setPhone(String phone) {

        this.phone = phone;

    }



    public String getCity() {

        return city;

    }



    public void setCity(String city) {

        this.city = city;

    }



    public String getState() {

        return state;

    }



    public void setState(String state) {

        this.state = state;

    }



    private void setEmail()

    {

        email = name.toLowerCase()+ "." + iD + "@muUniversity.com";

        System.out.println("Your Email: " + email);

    }

    public String getEmail() {

        return email;

    }

    private void setUserId() {

        int max = 9000;

        int min = 1000;

        int randNum = (int) (Math.random() * ((max - min)));

        randNum = randNum + min;

        userId = iD + "" + randNum + "" + ssn.substring(6);

        System.out.println("Your Account Number: " + userId);

    }

    public void enroll(String course)

    {

        this.course = this.course + " " + course;

        System.out.println(course);

        balance = balance + costOfCourse;

    }

    public void payTution(int amount)

    {

        System.out.println("Payment: $" + amount);

        balance = balance - amount;

    }



    public void checkBalance()

    {

        System.out.println("Balance: $" + balance);

    }



    public void showCourse()

    {

        System.out.println(course);

    }



    public String toString()

    {

        return "[NAME: " + name + "]\n[COURSES: " + course + "]\nBALANCE: " + balance + "]";

    }

}



