package Lab4_2._5;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type array size: ");
        int i = in.nextInt();
        int[] array= new int[i];

        for (int j = 0; j < i; j++) {
            array[j] = (int) (Math.random()*100);
        }
        System.out.println("Old array:");
        for (int k = 0; k < i; k++) {
            System.out.print(array[k] + " ");
        }

        System.out.println("\nNew array:");
        Sorter a = new Sorter();
        a.mergeSort(array, 0, array.length-1);
        for (int k = 0; k < i; k++) {
            System.out.print(array[k] + " ");
        }
    }
}
