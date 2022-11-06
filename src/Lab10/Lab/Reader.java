package Lab10.Lab;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    public void read(String file) throws Exception {
        File f = new File(file);
        if (!f.exists()) {
            System.out.println("no such file, creating a new one...");
            f.createNewFile();
        }

        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);

        ArrayList<String> list = new ArrayList<>();

        while (scan.hasNextLine()) {
            list.add(scan.nextLine());
        }
        fr.close();

        System.out.println(list);
    }
}