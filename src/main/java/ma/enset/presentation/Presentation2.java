package ma.enset.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("presentation2.txt"));

        String daoClassNAme = sc.nextLine();
        Class cDao = Class.forName(daoClassNAme);



    }
}
