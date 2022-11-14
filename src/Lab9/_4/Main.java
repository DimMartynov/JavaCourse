package Lab9._4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<User, Integer> map = new HashMap<>();
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        u1.setName("user1");
        map.put(u1, (int)(Math.random()*100));
        u2.setName("user2");
        map.put(u2, (int)(Math.random()*100));
        u3.setName("user3");
        map.put(u3, (int)(Math.random()*100));
        System.out.println("Type target player name:");
        String target = in.nextLine();

        for(Map.Entry<User, Integer> entry: map.entrySet()) {
            String value = entry.getKey().getName();
            int score = entry.getValue();
            if (Objects.equals(value, target)) {
                System.out.println(target + " score:" + score);
            }
        }

    }
}
