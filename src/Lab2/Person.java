package Lab2;

public class Person {
    private int id;
    private int age;
    public Person(){
    }
    public Person(int id, int age){
        this.id = id;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person id=" + id + ", age=" + age + '}';
    }
}
