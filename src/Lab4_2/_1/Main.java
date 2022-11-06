package Lab4_2._1;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int i = in.nextInt();
        int[] array = new int[i];
        for (int n = 0; n < i; n++) {
            System.out.print("Введите a[" + n + "]: ");
            array[n] = in.nextInt();
        }

        for (int m = 1; m < i; m++) {
            if (array[m-1]<=array[m]) {
            } else {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }
}
