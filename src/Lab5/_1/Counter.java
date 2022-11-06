package Lab5._1;

public class Counter {
    public String count(String a){
        String[] words = a.split(" ");
        int tlength = 0;
        String tword = "";
        for (String word : words) {
            if (word.length() > tlength) {
                tlength = word.length();
                tword = word;
            }
        }
        a = "Самое длинное слово: "+ tword + "\nКоличество символов: " + tlength;
        return a;
    }
}
