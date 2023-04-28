package pl.com.slupsk.ap.io;

import java.nio.file.Path;
import java.nio.file.Paths;

class PathFilePathTest {

    public static void main(String[] args) {
        Path path = Paths.get("C:\\test\\data\\zoo.txt\\ABC.txt");
        printInfo(path);
    }

    static void printInfo(Path path) {
        System.out.println("File name: " + path.getFileName());
        System.out.println("Root: " + path.getRoot());

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("path.name[" + i + "] = " + path.getName(i));
        }

        System.out.println("----");
        Path currentPath = path;
        while ((currentPath = currentPath.getParent()) != null) {
            System.out.println("current path: " + currentPath);
        }
    }
}
