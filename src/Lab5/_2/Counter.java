package Lab5._2;

public class Counter {
    public String palindr(String a) {
        a = a.toLowerCase();
        StringBuilder s =  new StringBuilder(a);
        if (s == s.reverse()) {
            return "Word is a palindrome";
        }
        return "Word is not a palindrome";
    }
}

