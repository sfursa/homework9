package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {
    private String fileName;
    public final static String DELIMITER = ";";

    public static void writePersons(String fileName, List<Person> perList) {
//        this.fileName = fileName;
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person p : perList) {
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

    public static List<Person> readPersons(String fileName) throws EmptySourceFileException {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                if (s == null || s.isEmpty()) {
                    throw new EmptySourceFileException("ОШИБКА! Файл не существует или пустой.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
