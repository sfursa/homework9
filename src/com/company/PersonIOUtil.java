package com.company;

import java.io.File;
import java.util.Collection;

public class PersonIOUtil {
    public static void writePersons(){
        String file;
        Collection collection;

        Person persona = new Person("Sergei", "Fursa", new Address("Slutsk", "Tutdrbnva", 13));
        Person personb = new Person("Olga", "Fursa", new Address("Slutsk", "Tutdrbnva", 13));
    }
}
