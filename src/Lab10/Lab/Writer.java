package Lab10.Lab;

import java.io.File;
import java.io.FileWriter;

public class Writer {
    public void write(String file, String text) throws Exception {
        File f = new File(file);
        if (!f.exists()) {
            System.out.println("no such file, creating a new one...");
            f.createNewFile();
        } else {
            System.out.println("file already exists in that folder");
        }

        FileWriter fw = new FileWriter(file);
        fw.write(text);
        fw.close();
    }
    public void writeln(String file, String text) throws Exception {
        File f = new File(file);
        if (!f.exists()) {
            System.out.println("no such file, creating a new one...");
            f.createNewFile();
        }

        FileWriter fw = new FileWriter(file, true);
        fw.append(text);
        fw.append("\n");
        fw.close();
    }
}
