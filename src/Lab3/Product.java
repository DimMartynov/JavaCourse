package Lab3;

public class Product {
    private String color;
    private String name;
    private String weight;

    public void setColor(String color) {
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }

    public String getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Product(String color){
        this.setName(color);
    }
    public Product(String color,String weight){
        this.setName(color);
        this.setName(weight);
    }
    public Product(){
    }
}
