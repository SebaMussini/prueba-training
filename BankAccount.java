package com.oop;

// We will have   Statics Variables (belong to the class), Instance Variables (belong to the object instance)
// and Local Variables (are define within blocks, only exist there)

// Polymorphism is the ability for us to call different names and access different elements with the same names.
// Un ejemplo de ello son los Constructors.
// Podemos tener el mismo nombre para un método, pero llamar a través de él a diferentes códigos, dependiendo de
// los parámetros.


public class BankAccount implements IRate {

    // Define variables

    // statics means that this value belong to the class, and NO to the particular object instance
    // final  means that it's like a constant. It cannot be redefined
    private static final String routingNumber = "122455";

    // Si quiero crear números aleatorios entre 0 y 1 puedo utilizar el método Math.random
    int random = (int) (Math.random() * 100);



    // Instance variables
    private String name;

    String accountNumber;
    private String ssn;
    String accountType;
    double balance = 0;


    // Constructors definitions
    // Constructors are unique methods. They have 4 characteristics:
        // 1- They are used to define/setup/initialize properties of an object
        // 2- Constructors are IMPLICITY called automatically upon instantiation (instancia)
        // 3- The same name as the class itself
        // 4- Constructors have NO return type

    BankAccount() {
        System.out.println("New account created");
    }


    // Polymorphism through overloading
    // Overloading: is when we call the same method name with different arguments

    BankAccount(String accountType){
        System.out.println("New account: " + accountType);

    }

    BankAccount(String accountType, double initDeposit){

        // initDeposit, accountType, Msg  are all Local Variables
        System.out.println("New account: " + accountType);
        System.out.println("Initial Deposit of: " + initDeposit);
        String Msg = null;
        if (initDeposit < 1000) {
            Msg = "Error: Minimum deposit must be at least $1,000";
        }
        else {
            Msg = "Thanks for your deposit of $ " + initDeposit;
        }
        System.out.println(Msg);
        balance = balance + initDeposit;

    }



    // GETTER  /   SETTERS

    // We want to allow the user to define the name, but we DONT want them to find the variable name
    // outright.  We want them to call a function that is going to define the name. This function will be public.
    public void setName(String name) {
        this.name = "Mr. " + name;
        // this.name  se está refiriendo al name que pertenece a la clase, que es una variable String PRIVADA, que
        // definimos en la línea 15.  Y el name a la derecha de la igualdad    name;   se refiere al argumento
        // de la variable  setName

    }

    // Now we must create another method where the client could actually get that value (name).
    // So, if the client want to receive something we DONT want void.
    public String getName() {
        return name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }



    // INTERFACE Methods
    public void setRate() {
        System.out.println("Setting rate");

    }

    public void increaseRate() {
        System.out.println("Increasing rate");

    }



    // ACCESS MODIFIER
        // Public   means it is available anywhere in the Project
        // Default   means it is available anywhere in the Package
        // Private    means it is available only in the class

    // Define methods
    public void deposit(double amount) {
        balance = balance + amount;
        showActivity("Deposit");

    }

    void withdraw(double amount) {
        balance = balance + amount;
        showActivity("Withdraw");

    }


    private void showActivity(String activity) {
        System.out.println("Your recent transaction: " + activity);
        System.out.println("Your new balance is: $" + balance);

    }

    void checkBalance() {
        System.out.println("Balance: " + balance);

    }

    void getStatus() {

    }

    // by having the @Override, ahora cuando llamemos al método    toString, estaremos llamando al toString  de
    // nuestra clase BankAccount   y  NO al método  toString  de la clase objeto, que está un nivel por encima de
    // nuestra clase BankAccount
    @Override
    public String toString() {
        return "Name: " + name + ".  Account #" + accountNumber + ". Routing #" + routingNumber + ". Balance: $ " + balance;



    }

}
