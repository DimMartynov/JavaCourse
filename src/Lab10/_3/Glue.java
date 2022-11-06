package Lab10._3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Glue {

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

    public void write(String file, String text) throws Exception {
        File f = new File(file);
        if (!f.exists()) {
            System.out.println("no such file, creating a new one...");
            f.createNewFile();
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

    public void stick(String file1, String file2) throws Exception{
        File f2 = new File(file2);
        if (!f2.exists()) {
            System.out.println("no such file, creating a new one...");
            f2.createNewFile();
        }

        FileReader fr = new FileReader(file2);
        Scanner scan = new Scanner(fr);

        ArrayList<String> list = new ArrayList<>();

        while (scan.hasNextLine()) {
            list.add(scan.nextLine());
        }
        fr.close();

        Glue g = new Glue();
        for (String s : list) {
            g.writeln(file1, s);
        }
    }

    public void cens(String file) throws Exception {
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

        Glue g = new Glue();
        String reg = "[^\\w ]";

        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher("");
        g.write(file, "");
        for (String s : list) {
            matcher = pattern.matcher(s);
            g.writeln(file, matcher.replaceAll("\\$"));
        }
    }

}
