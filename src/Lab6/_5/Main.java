package Lab6._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Secondary a = new Secondary();
        int age = in.nextInt();
        a.setAge(age);
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        a.setName(name);
        System.out.println(a.getAge());
    }
}