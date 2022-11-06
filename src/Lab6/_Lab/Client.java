package Lab6._Lab;

public class Client extends Man {

    String bank;

    public Client() {
    }

    public Client(String name, String surname, String bank) {
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
