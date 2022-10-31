package Lab3;

import java.time.Year;

public class Dom {
    public int floors;
    public int year;
    public String name;

    public void setDom(int floors, int year, String name){
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "floors=" + floors +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public int age(){
        int vzr = Year.now().getValue() - this.year;
        return vzr;
    }
}
