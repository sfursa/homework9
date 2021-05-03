package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1= new Person("Евгений", "Казачок", new Address("Старые Дороги", "Пионерская", 21));
        Person person2 = new Person("Сергей", "Фурса", new Address("Слуцк", "Тутаринова", 13));
        Person person3 = new Person("Коля", "Сухан", new Address("Минск", "Партизанский", 150));

        List<Person>personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        for (Person person : personList){
            System.out.println(person);
            System.out.println();
        }
    }

    public static void nothing(String a) throws EmptySourceFileException {
        if (a == null) {
            throw new EmptySourceFileException();

        }
    }
}
