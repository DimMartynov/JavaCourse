package Lab5._5;

public class Counter {
    public String reverter(String str) {
        String newstr = "";
        String[] words = str.split(" ");
        for (String word : words) {
            StringBuilder neww = new StringBuilder(word);
            newstr = newstr + neww.reverse() +" ";
        }
        return newstr;
    }
}
