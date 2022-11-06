package Lab2;

public class Calculator {
    public static int sum(int a, int b) {
        return (a+b);
    }
    public static double sum(double ad, double bd) {
        return (ad+bd);
    }
    public static long sum(long al, long bl) {
        return (al+bl);
    }

    public static int min (int a, int b) {
        return (a-b);
    }
    public static double min (double ad, double bd) {
        return (ad-bd);
    }
    public static long min (long al, long bl) {
        return (al-bl);
    }

    public static int mul (int a, int b) {
        return (a*b);
    }
    public static double mul (double ad, double bd) { return (ad*bd); }
    public static long mul (long al, long bl) {
        return (al*bl);
    }

    public static double div (int a, int b) { return (a/(double)b); }
    public static double div (double ad, double bd) { return (ad/bd); }
    public static double div (long al, long bl) {return (al/(double)bl); }
}

