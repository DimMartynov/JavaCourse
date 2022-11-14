package Lab10._3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Glue {

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

    public void stick(String file1, String file2) throws Exception{
        Glue g = new Glue();
        ArrayList<String> list = new ArrayList<>(g.read(file2));
        for (String s : list) {
            g.writeln(file1, s);
        }
    }

    public void cens(String file) throws Exception {
        Glue g = new Glue();
        ArrayList<String> list = new ArrayList<>(g.read(file));

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
