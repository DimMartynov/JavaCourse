package Lab1;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        float a = (46 + 10) * ((float) 10 / 3);
        System.out.println(a);

        float b = (29 * 4 * (-15));
        System.out.println(b);

        int number = 10500;
        double result = ((double) number / 10) / 10;
        System.out.println(result);

        result = 3.6 * 4.1 * 5.9;
        System.out.println(result);

        System.out.println("Введите три целых числа>>");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println("Введите целое число>>");
        int num4 = in.nextInt();

        if (num4 % 2 == 1) {
            System.out.println("Нечётное");
        } else if (num4 == 0) {
            if (num4 > 100) {
                System.out.println("Выход за пределы диапозона");
            } else {
                System.out.println("Чётное");
            }
        }
    }
}
