package Lab5._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("The given string is:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Counter a = new Counter();
        System.out.println("The string reversed word by word is:" + a.reverter(str));
    }
}
