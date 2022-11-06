package Lab4_1._2;

public class Main {
    public static void main(String[] arg) {
        int i = 1;
        while (i<100) {
            if (i%3==0) {
                if (i%5==0) {
                    System.out.println("Делится на 3 и 5: " + i);
                } else {
                    System.out.println("Делится на 3: " + i);
                }
            } else if (i%5==0) {
                System.out.println("Делится на 5: " + i);
            }
            i = i + 1;
        }
    }
}
