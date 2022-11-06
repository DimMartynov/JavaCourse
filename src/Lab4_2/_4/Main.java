package Lab4_2._4;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Array length: ");
        int i = in.nextInt();
        int[] array = new int[i];
        System.out.println("Numbers of array:");
        for (int n = 0; n < i; n++) {
            array[n] = in.nextInt();
        }
        Reader a = new Reader();
        System.out.print(a.unique(array));
    }
}
