package org.example.sem2_dz;

import lombok.Data;

@Data
public class Student {
    private static long idCounter = 1;
    private final long id;
    private final String name;
    private final String group;

    public Student(String name, String group) {
        this.id = idCounter++;
        this.name = name;
        this.group = group;
    }
}
