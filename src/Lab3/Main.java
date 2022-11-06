package Lab3;

class Main {
    public static void main(String[] args) {
        Study a = new Study();
        a.setCourse("Изучение Java - это просто!");
        a.printCourse();

        Product b = new Product();
        b.setName("car");
        b.setColor("white");
        b.setWeight("2 tons");
        System.out.println(b.toString());

        Dom c = new Dom();
        c.setDom(3,2001, "Ozerkovaya");
        System.out.println(c.toString());
        System.out.println(c.age());

        Tree dub = new Tree(23, "dubochek");
        Tree bereza = new Tree(134, true, "berezishche");
        Tree elka = new Tree();
    }
}