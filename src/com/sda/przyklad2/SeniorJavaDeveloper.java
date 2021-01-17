package com.sda.przyklad2;

public class SeniorJavaDeveloper extends JavaDeveloper{

    private int yearsofexperience;

    public SeniorJavaDeveloper(String name, String surname, int age, int salary, String[] knownTechnologies, int yearsofexperience) {
        super(name, surname, age, salary, knownTechnologies);
        this.yearsofexperience = yearsofexperience;
    }

    public int getYearsofexperience() {
        return yearsofexperience;
    }

    public void setYearsofexperience(int yearsofexperience) {
        this.yearsofexperience = yearsofexperience;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Senior Java Developerem, nazywam się " + getName() + " "
                + getSurname() + " i mam " + getAge()
                + " i zarabiam " + getSalary() + " pracuję w zawodzie już " + getYearsofexperience());
    }
}
