package Lab4_1._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int i = in.nextInt();
        int[] array = new int[i];
        for (int n = 0; n < i; n++) {
            System.out.print("Введите a[" + n + "]: ");
            array[n] = in.nextInt();
        }
        System.out.print("array = " + array[0]);
        for (int m = 1; m < i; m++) {
            System.out.print(", " + array[m]);
        }
        System.out.println();
        System.out.println(((array[0]==3||array[i-1]==3)));
    }
}
