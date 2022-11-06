package Lab6._Lab;

public abstract class Man {
    String name;
    String surname;

    public Man() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public abstract String toString();

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
