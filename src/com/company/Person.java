package com.company;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullFieldException("Ошибка!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullFieldException("Ошибка!");
        }
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (address ==null){
            throw new NullFieldException("Ошибка!");
        }
        this.address = address;
    }

    public Person(String firstName, String lastName, Address address) {
        if(firstName == null || lastName == null || address == null) {
            throw new NullFieldException("Ошибка!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Имя: " + firstName + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Адрес: " + address;
    }
}
