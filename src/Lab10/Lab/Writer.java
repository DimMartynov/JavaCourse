package Lab10.Lab;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Writer {
    public void write(String file, String text) throws Exception {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("no such file, creating a new one...");
            new File(file).createNewFile();
            fw = new FileWriter(file);
        } finally {
            fw.write(text);
        }
        fw.close();
    }
    public void writeln(String file, String text) throws Exception {
        FileWriter fw = null;
        try {
            fw = new FileWriter(file, true);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("no such file, creating a new one...");
            new File(file).createNewFile();
            fw = new FileWriter(file, true);
        } finally {
            fw.append(text);
            fw.append("\n");
        }
        fw.close();
    }
}
