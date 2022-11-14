package Lab10.Lab;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public ArrayList<String> read(String file) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        FileReader fr = null;
        try {
            fr = new FileReader(file);

        } catch (java.io.FileNotFoundException e) {
            System.out.println("no such file, creating a new one...");
            new File(file).createNewFile();
            fr = new FileReader(file);

        } finally {
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        }

        fr.close();
        return list;
    }
}