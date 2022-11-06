package Lab5._5;

public class Counter {
    public String reverter(String str) {
        String newstr = "";

        String[] words = str.split(" ");
        for (String word : words) {
            String newword = "";
            char[] cArray = word.toCharArray();
            for (int i = 0; i < cArray.length / 2; i++) {
                char tc = cArray[i];
                cArray[i] = cArray[cArray.length - i - 1];
                cArray[cArray.length - i - 1] = tc;
            }
            for (int i = 0; i < cArray.length; i++) {
                newword = newword + cArray[i];
            }

            newstr = newstr + newword +" ";
        }
        return newstr;
    }
}
