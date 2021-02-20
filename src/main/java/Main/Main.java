package Main;

import Directory.Directory;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fileFrom;
        String fileTo;

        System.out.println("Write the directory you want information from.");
        fileFrom = scanner.nextLine();

        System.out.println("Write the directory to which you want to save the information.");
        fileTo = scanner.nextLine();


    }
}