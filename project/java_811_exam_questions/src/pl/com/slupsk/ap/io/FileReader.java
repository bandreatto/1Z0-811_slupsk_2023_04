package pl.com.slupsk.ap.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public static void main(String[] args) throws IOException {
        // Ćwiczenie 1
        Path path = Paths.get("C:\\test\\data\\ABC.txt");
        readFile(path);

        // Ćwiczenie 2
//        walkPath(Paths.get("C:\\test"));
    }

    static void readFile(Path path) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lines.forEach(System.out::println);
    }

    static void walkPath(Path basePath) throws IOException {
        Files.walk(basePath)
                .filter(currentPath -> currentPath.toString().endsWith(".java"))
                .forEach(System.out::println);
    }
}
