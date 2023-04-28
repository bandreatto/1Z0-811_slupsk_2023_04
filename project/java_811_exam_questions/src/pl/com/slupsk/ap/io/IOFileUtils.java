package pl.com.slupsk.ap.io;

import java.io.File;
import java.util.Arrays;

public class IOFileUtils {

    public static void main(String[] args) {
        printInfo(args[0]);
    }

    static void printInfo(String name) {
        File file = new File(name);
        System.out.println("File exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Parent: " + file.getParent());

            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("Last modified at: " + file.lastModified());
            } else {
                File[] subFiles = file.listFiles();
                Arrays.stream(subFiles) // tworzymy strumień z tablicy
                        .forEach(subFile -> System.out.println(subFile.getName()));
            }
        }
    }
}
