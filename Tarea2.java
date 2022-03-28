package com.oop;

public class Tarea2 {

    public static void main (String[] args) {

        Tarea2 student = new Tarea2("Seba", "666555", 55677, "Cotorra", "Uruguay");

        student.enroll("Sexologia");
        student.pay(400);
        System.out.println(student.toString());



    }

    // -----------**********************-------------------


    // Defino atributos

    String asignatura;
    String userID;
    String name;
    String ssn;
    String email;
    int balance;
    int phone;
    String city;
    String state;
    private static int ID;



    // -----------**********************-------------------


    // Creamos un Constructor, que debe llevar exactamente el mismo nombre de la Clase

    Tarea2(String name, String ssn, int phone, String city, String state){

        email = name + "@university.com";
        this.name = name;
        this.ssn = ssn;

    }


    // -----------**********************-------------------


    // Creamos los métodos

    public String generateID() {
        ID = (int) (Math.random()*10000);
        return userID = ID + "-" + ssn.substring(2, 6);
    }


    public void enroll(String asignatura) {
        this.asignatura = asignatura;
        balance = 879;

    }


    public void pay(int amount) {
        balance = balance - amount;
    }


    public int checkBalance() {
        return balance;

    }

    public String showCourses() {
        return this.asignatura;

    }


    // -----------**********************-------------------

    // Renombramos el metodo toString para que primero ejecute lo definido en mi clase /  Polymorphism

    @Override
    public String toString() {
        return "Ud esta inscripto a: " + showCourses() + " y su balance es: $" + checkBalance() + " y su userID es: " + generateID();

    }



    // -----------**********************-------------------


    //  Definimos Getter & Setter  //   ENCAPSULATION


    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPhone() {

        return "Your phone is: " + phone;
    }


    // -----------**********************-------------------



    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {

        return "Your city is: " + city;
    }



    // -----------**********************-------------------



    public void setState(String state) {
        this.state = state;
    }

    public String getState() {

        return "Your state is: " + state;
    }












}
