package com.campusdual.classroom;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void getDetails() {
        System.out.println("El nombre completo de la persona es: " + this.name + " " + this.surname + "\n");
    }
}
