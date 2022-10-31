package Lab4_2._4;

public class Reader {
    public String unique(int[] a) {
        int t;
        int[] b = new int[a.length];
        for (int l = 0; l<a.length; l++) {
            b[l] = 0;
        }
        for (int i = 0; i<a.length; i++) {
            for (int j = i+1; j<a.length; j++) {
                if (a[i] == a[j]) {
                    b[i]++;
                    b[j]++;
                }
            }
        }
        for (int k = 0; k<a.length; k++) {
            if (b[k]==0) {
                return a[k] + " является первым уникальным числом в массиве";
            }
        }
        return "Уникальных чисел в массиве нет";
    }
}
