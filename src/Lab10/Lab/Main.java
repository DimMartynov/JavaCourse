package Lab10.Lab;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Writer w = new Writer();
        String text = "des";
        w.writeln("file.txt", text);
        Reader r = new Reader();
        r.read("file.txt");
    }
}
