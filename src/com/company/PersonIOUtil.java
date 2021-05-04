package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class PersonIOUtil {
    private String file;

    public static void writePersons(String file, List<Person>personList) {
        try (FileWriter writer = new FileWriter(file)) {
            for (Person person : personList)
                writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
