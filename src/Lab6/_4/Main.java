package Lab6._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Secondary a = new Secondary();
        Scanner in = new Scanner(System.in);
        a.setPole(in.nextInt());
        System.out.println(a.toString());
    }
}
