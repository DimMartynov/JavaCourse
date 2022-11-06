package Lab6._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Secondary a = new Secondary();
        String name = in.nextLine();
        a.getName(name);
    }
}
