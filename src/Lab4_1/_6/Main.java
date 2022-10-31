package Lab4_1._6;

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

        for (int m = 0; m < i; m++) {
            if (array[m]==1||array[m]==3) {
                System.out.println((array[m]==1||array[m]==3));
                return;
            }
        }
    }
}
