package com.company;

public class Person {
    String firstName;
    String lastName;
    Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String firstName, String lastName, Address address) {
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
    public class NullFieldException extends RuntimeException {
        public NullFieldException(String message) {
            super(message);
        }
    }
}
