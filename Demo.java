package com.oop;


public class Demo {


    public static void main (String[] args) {


        // Creamos un nuevo objeto de la clase Persona, que llamaremos  persona1
        Person person1 = new Person();

        // Este objeto llamado  persona1, tiene los atributos y acciones (métodos) que definí en la
        // clase persona, al comienzo del código.


        // atributos o propiedades
        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "54546516515";

        // acciones o métodos o funciones o abstraccion
        person1.walk();
        person1.eat();
        person1.sleep();





        /*

        // Person

           // Attributes, variables, adjectives, descriptors
        String name = "Joe";
        String email = "joe@testemail.com";
        String phone = "78846456";

           // Action, activity, behaviour
        //System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");


        // What if we want to do this for another person

        String name2 = "Sarah";
        String email2 = "sarah@testemail.com";
        String phone2 = "7666456";

        // Action, activity, behaviour
        //System.out.println(name + " is walking");
        walking(name2);
        System.out.println(name + " is eating");

        // What about binding attributes and properties together?


    }

    // Enhance by adding functions to minimize code

    static void walking(String name) {
        System.out.println(name + " is walking");

    */
    }



}



// creamos una blueprint de la clase Person, con sus atributos y acciones (métodos)
// Luego, podemos asociarlos a la clae persona, como veremos en el main.

class Person {

    String name;
    String email;
    String phone;


    void walk() {
        System.out.println(name + " is walking");

    }

    void eat() {
        System.out.println(email);

    }

    void sleep(){
        System.out.println(name + " is sleeping");

    }


}
