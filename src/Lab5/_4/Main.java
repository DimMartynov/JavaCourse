package Lab5._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String substr = in.nextLine();
        Counter a = new Counter();
        a.incount(str,substr);
    }
}
