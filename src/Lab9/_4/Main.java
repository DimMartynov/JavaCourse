package Lab9._4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        System.out.println("Type player 1 name:");
        String name1 = in.nextLine();
        User u1 = new User();
        u1.setName(name1);
        map.put(u1, (int)(Math.random()*100));
        System.out.println("Type player 2 name:");
        String name2 = in.nextLine();
        User u2 = new User();
        u2.setName(name2);
        map.put(u2, (int)(Math.random()*100));
        System.out.println("Type player 3 name:");
        String name3 = in.nextLine();
        User u3 = new User();
        u3.setName(name3);
        map.put(u3, (int)(Math.random()*100));

        System.out.println(u1.getName());
        System.out.println(u2.getName());
        System.out.println(u3.getName());
        System.out.println("Type target player name:");
        String target = in.nextLine();

        int i = 0;
        for(Map.Entry<User, Integer> entry: map.entrySet()) {
            String value = entry.getKey().getName();
            int score = entry.getValue();
            if (Objects.equals(value, target)) {
                i++;
                System.out.println(target + " score:" + score);
            }
        }

    }
}
