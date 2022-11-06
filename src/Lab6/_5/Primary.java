package Lab6._5;

import java.time.Year;

public class Primary {
    String name;
    public int age(int year) {
        int age = Year.now().getValue() - year;
        return age;
    }

    public String getName(String name) {
        return this.name;
    }

    public Primary() {
        this.name = "noname";
    }
}
