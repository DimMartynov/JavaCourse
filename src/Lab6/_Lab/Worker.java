package Lab6._Lab;

public class Worker extends Man {

    String bank;

    public Worker() {
    }

    public Worker(String name, String surname, String bank) {
        this.name = name;
        this.surname = surname;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bank='" + bank + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
