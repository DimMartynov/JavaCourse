package Lab2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat( "#.###" );

        Scanner in = new Scanner(System.in);
        int num1 = 12;
        int num2 = 13;
        int sum = Calculator.sum(num1, num2);
        int min = Calculator.min(num1, num2);
        int mul = Calculator.mul(num1, num2);
        double div = Calculator.div(num1, num2);
        long num1l = 12;
        long num2l = 13;
        long sum_l = Calculator.sum(num1l, num2l);
        long min_l = Calculator.min(num1l, num2l);
        long mul_l = Calculator.mul(num1l, num2l);
        double div_l = Calculator.div(num1l, num2l);
        double num1d = 12;
        double num2d = 13;
        double sum_d = Calculator.sum(num1d, num2d);
        double min_d = Calculator.min(num1d, num2d);
        double mul_d = Calculator.mul(num1d, num2d);
        double div_d = Calculator.div(num1d, num2d);
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 + "-" + num2 + "=" + min);
        System.out.println(num1 + "*" + num2 + "=" + mul);
        System.out.println(num1 + "/" + num2 + "=" + div);

        System.out.println(num1l + "+" + num2l + "=" + sum_l);
        System.out.println(num1l + "-" + num2l + "=" + min_l);
        System.out.println(num1l + "*" + num2l + "=" + mul_l);
        System.out.println(num1l + "/" + num2l + "=" + div_l);

        System.out.println(num1d + "+" + num2d + "=" + sum_d);
        System.out.println(num1d + "-" + num2d + "=" + min_d);
        System.out.println(num1d + "*" + num2d + "=" + mul_d);
        System.out.println(num1d + "/" + num2d + "=" + div_d);
    }
}