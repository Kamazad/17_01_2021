package com.sda.przyklad2;

public class Menedzer extends Employee {

    private Employee[] employees;

    public Menedzer(String name, String surname, int age, int salary, Employee[] employees) {
        super(name, surname, age, salary);
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Menedzerem nazywam się " + getName() + " "
                + getSurname() + " i mam " + getAge()
                + " i zarabiam " + getSalary()
                + " a to są moim pracownicy"+ getEmployees() );
    }
}
