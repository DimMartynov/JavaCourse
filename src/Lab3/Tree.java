package Lab3;
public class Tree {
    public int age;
    public boolean alive;
    public String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}

