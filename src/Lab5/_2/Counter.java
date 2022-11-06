package Lab5._2;

public class Counter {
    public String palindr(String a) {
        char[] cArray = a.toCharArray();
        for (int i=0; i<cArray.length/2; i++) {
            if (cArray[i] == cArray[cArray.length-i-1]) {} else {
                return "Word is not a palindrome";
            }
        }
        return "Word is a palindrome";
    }
}
