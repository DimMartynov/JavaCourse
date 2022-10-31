package Lab2;

public class Calculator {
    private int a;
    private int b;
    private double ad;
    private double bd;
    private float af;
    private float bf;


    public static int sum(int a, int b) {
        return (a+b);
    }
    public static double sum(double ad, double bd) {
        return (ad+bd);
    }
    public static float sum(float af, float bf) {
        return (af+bf);
    }

    public static int min (int a, int b) {
        return (a-b);
    }
    public static double min (double ad, double bd) {
        return (ad-bd);
    }
    public static float min (float af, float bf) {
        return (af-bf);
    }

    public static int mul (int a, int b) {
        return (a*b);
    }
    public static double mul (double ad, double bd) {
        return (ad*bd);
    }
    public static float mul (float af, float bf) {
        return (af*bf);
    }

    public static int div (int a, int b) {
        return (a/b);
    }
    public static double div (double ad, double bd) {
        return (ad/bd);
    }
    public static float div (float af, float bf) {
        return (af/bf);
    }
}

