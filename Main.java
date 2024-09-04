package org.example;

public class Main {

    public static void main(String[] args) {
        Account a1 = new Account("Hiroshi", 22102539);
        Account a2 = new Account("Garb", 22102540);

        Vehicle c1 = new Vehicle(200, "Cyan", "Mustang", "Ford", "404", false);
        Vehicle c2 = new Vehicle(500, "Black", "Corvette", "Chevrolet", "505", false);

    a1.deposit(10000);
    a1.verify();
    a1.display();
    a1.transfer(a2, 5000);
    a2.verify();
    a2.display();


        c1.accelerate();
        c1.decelerate();
        c1.display();











    }
}