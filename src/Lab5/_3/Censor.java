package Lab5._3;

public class Censor {
    public void cens(String str) {
        str = str.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(str);
        return;
    }
}
