package com.sda.przyklad2;

import javax.lang.model.element.UnknownAnnotationValueException;

public class Main {
    public static void main(String[] args) {

        //Person person = new Employee("Jan", "Kowalski", 50);
        //person.decribe();

        String [] strings = {"a", "b"};

        Employee person = new JavaDeveloper("Jan", "Kowalski",
                50, 20000, strings);

        //person.describe();

        Employee person2 = new JavaDeveloper("Kamil", "Duda",
                10, 200000, strings);
        Employee person1 = new Employee("KTos", "Jakis", 46, 1234 );

        Employee person3 = new SeniorJavaDeveloper("Ja to Ja", "bo Ty to Ty ", 30, 123456, strings, 0);
        Employee[] employees = {person, person1, person2, person3};

        Employee[] employees1 = {
                person,
                new Employee("Adam", "Nowak", 20, 23),
                new Menedzer("Marian", "Jakikolwiek", 456, 456,null),
                new JavaDeveloper("Stefan", "Nowa", 564, 545613, null),
                new SeniorJavaDeveloper("Algfds", "kjjhksfs", 56, 561321, null, 423),
        };

        Employee manager = new Menedzer("Jan", "Kowalski",
                50, 20000,
                employees);

       // manager.describe();

        Menedzer manager1 = new Menedzer("Drugi", "Kowalski",
                20, 20000,
                employees1);


        for (Employee employee : manager1.getEmployees()){
            employee.describe();
        }

    }
}
