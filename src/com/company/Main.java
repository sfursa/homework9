package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1= new Person("Евгений", "Казачок", new Address("Старые Дороги", "Пионерская", 21));
        Person p2 = new Person("Сергей", "Фурса", new Address("Слуцк", "Тутаринова", 13));
        Person p3 = new Person("Коля", "Сухан", new Address("Минск", "Партизанский", 150));

        List<Person> perList = new ArrayList<>();
        perList.add(p1);
        perList.add(p2);
        perList.add(p3);

        for (Person person : perList){
            System.out.println(person);
            System.out.println();
        }
        PersonIOUtil.writePerson("text.txt",perList);
    }


}
