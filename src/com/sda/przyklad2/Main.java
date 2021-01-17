package com.sda.przyklad2;

public class Main {
    public static void main(String[] args) {

        //Person person = new Employee("Jan", "Kowalski", 50);
        //person.decribe();

        String [] strings = {"a", "b"};

        Employee person = new JavaDeveloper("Jan", "Kowalski",
                50, 20000, strings);

        person.describe();

        Employee person2 = new JavaDeveloper("Kamil", "Duda",
                10, 200000, strings);
        Employee person1 = new JavaDeveloper("Kazik", "Stankiewicz", 30, 5000, strings);

        Employee person3 = new SeniorJavaDeveloper("Ja to Ja", "bo Ty to Ty ", 30, 123456, strings, 0);
        Employee[] employees = {person, person1, person2, person3};

        Employee manager = new Menedzer("Jan", "Kowalski",
                50, 20000,
                employees);

        manager.describe();


    }
}
