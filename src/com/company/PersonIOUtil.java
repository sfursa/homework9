package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonIOUtil {
    private String file;
    public final static String DELIMITER = ";";

    public static void writePerson (String file, List<Person> perList) {
        try (FileWriter writer = new FileWriter(file)) {
            for(Person p : perList){
                writer.write(toTxtString(p));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toTxtString(Person person) {
        return person.getFirstName() + DELIMITER +
                person.getLastName() + DELIMITER +
                person.getAddress().getCity() + DELIMITER +
                person.getAddress().getStreet() + DELIMITER +
                person.getAddress().getHouse() + DELIMITER + "\n";

    }
}
