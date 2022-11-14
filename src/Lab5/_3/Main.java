package Lab5._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Censor a = new Censor();
        str = a.cens(str);
        System.out.println(str);
    }
}
