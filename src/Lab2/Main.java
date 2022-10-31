package Lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 169;
        int num2 = 13;
        int sum = Calculator.sum(num1, num2);
        int min = Calculator.min(num1, num2);
        int mul = Calculator.mul(num1, num2);
        int div = Calculator.div(num1, num2);
        int num1f = 169;
        int num2f = 13;
        int sum_f = Calculator.sum(num1f, num2f);
        int min_f = Calculator.min(num1f, num2f);
        int mul_f = Calculator.mul(num1f, num2f);
        int div_f = Calculator.div(num1f, num2f);
        int num1d = 169;
        int num2d = 13;
        int sum_d = Calculator.sum(num1d, num2d);
        int min_d = Calculator.min(num1d, num2d);
        int mul_d = Calculator.mul(num1d, num2d);
        int div_d = Calculator.div(num1d, num2d);
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 + "-" + num2 + "=" + min);
        System.out.println(num1 + "*" + num2 + "=" + mul);
        System.out.println(num1 + "/" + num2 + "=" + div);

        System.out.println(num1f + "+" + num2f + "=" + sum_f);
        System.out.println(num1f + "-" + num2f + "=" + min_f);
        System.out.println(num1f + "*" + num2f + "=" + mul_f);
        System.out.println(num1f + "/" + num2f + "=" + div_f);

        System.out.println(num1d + "+" + num2d + "=" + sum_d);
        System.out.println(num1d + "-" + num2d + "=" + min_d);
        System.out.println(num1d + "*" + num2d + "=" + mul_d);
        System.out.println(num1d + "/" + num2d + "=" + div_d);
    }
}
