package Lab5._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Counter a = new Counter();
        System.out.println(a.count(str));
    }
}
