package Lab9._4;

import java.util.Scanner;

public class User {

    private String name;

    public User(String name, int age, int weight) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
