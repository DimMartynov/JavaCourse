package Lab5._3;

public class Censor {
    public String cens(String str) {
        str = str.replaceAll("бяка", "[вырезано цензурой]");
        return str;
    }
}
