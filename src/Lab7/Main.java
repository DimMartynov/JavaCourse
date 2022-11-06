package Lab7;

public class Main {
    public static void main(String[] args) {
        Airplane.Wing a = new Airplane.Wing();
        Airplane.Wing b = new Airplane.Wing();
        a.setWeight(21);
        b.setWeight(32);
        System.out.println(a.getWeight());
        System.out.println(b.getWeight());
    }
}
