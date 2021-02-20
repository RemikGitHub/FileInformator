package Main;

import Directory.Directory;
import Json.Json;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    private static String fileFrom;
    private static String fileTo;

    public static void main(String[] args) {

        setFileFrom();
        setFileTo();

        Directory directory = new Directory(fileFrom);
        Json.fileMetadataToJson(fileTo, directory.getFilesMetadataFromDirectory());
    }

    private static void setFileFrom() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the directory you want information from.");
        fileFrom = scanner.nextLine();

        while ( !Files.isDirectory(Paths.get(fileFrom)) ){
            System.out.println("Write right directory!");
            fileFrom = scanner.nextLine();
        }
    }

    private static void setFileTo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the directory to which you want to save the information.");
        fileTo = scanner.nextLine();

        while ( !Files.isDirectory(Paths.get(fileTo)) ){
            System.out.println("Write right directory!");
            fileFrom = scanner.nextLine();
        }
    }
}