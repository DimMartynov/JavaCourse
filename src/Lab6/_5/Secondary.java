package Lab6._5;

public class Secondary extends Primary {
    @Override
    public String getName(String name) {
        System.out.println(this.name);
        this.name = name;
        System.out.println(this.name);
        return this.name;
    }
}
