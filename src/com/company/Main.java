package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

//        nothing(null);


        Person person1= new Person("Ольга", "Казачок", new Address("Слуцк", "Тутаринова", 13));
        Person person2 = new Person("Сергей", "Фурса", new Address("Слуцк", "Тутаринова", 13));
        Person person3 = new Person("Коля", "Фурса", new Address("Слуцк", "Тутаринова", 13));
        System.out.println(person1);
        System.out.println();
        System.out.println(person2);
        System.out.println();
        System.out.println(person3);

    }

    public static void nothing(String a) throws EmptySourceFileException {
        if (a == null) {
            throw new EmptySourceFileException();

        }
    }
}
