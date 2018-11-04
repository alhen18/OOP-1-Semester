package Modul13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextIO {

    public static void main(String[] args) {
        File file = new File("twocolors.csv");

        String input = "1, 2, red, blue";
        Scanner r;

        if(file.exists()) {
            try (PrintWriter pw = new PrintWriter(file); Scanner a = new Scanner("String")) {
                pw.print(input);
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("The file was not found!!");
            }

            try {
                r = new Scanner(file).useDelimiter(",");
                while (r.hasNext()) {
                    r.next();
                }
                System.out.println(r.nextInt());
                System.out.println(r.nextInt());
                System.out.println(r.next());
                System.out.println(r.next());
                r.close();
            } catch (FileNotFoundException e) {
                r = null;
                System.out.println("The file was not found");
            }
        } else {
            System.exit(0);
        }
    }
}
