package com.sda.przyklad2;

public class JavaDeveloper extends Employee{

    private String[] knownTechnologies;

    public JavaDeveloper(String name, String surname, int age, int salary, String[] knownTechnologies) {
        super(name, surname, age, salary);
        this.knownTechnologies = knownTechnologies;
    }

    public String[] getKnownTechnologies() {
        return knownTechnologies;
    }

    public void setKnownTechnologies(String[] knownTechnologies) {
        this.knownTechnologies = knownTechnologies;
    }

    @Override
    public void describe() {
        System.out.println("Jestem Java Developerem nazywam się " + getName() + " "
                + getSurname() + " i mam " + getAge()
                + " i zarabiam " + getSalary() + " i znam "+ getKnownTechnologies());
    }
}
