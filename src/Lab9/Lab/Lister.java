package Lab9.Lab;

import java.util.*;

public class Lister {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void test() {
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();
        final int n = 1000000;
        final int m = 100000;
        for (int i = 0; i < n; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < m; i++) {
            arrayList.get((int) (Math.random() * (n - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < m; i++) {
            linkedList.get((int) (Math.random() * (n - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}