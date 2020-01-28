package javafile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {
        Files.list(getDir()).forEach(System.out::println);

        Predicate<? super Path> predicsted = path -> String.valueOf(path).contains(".java");
        Files.walk(getDir(), 2)
                .filter(predicsted)
                .forEach(System.out::println);
    }

    private static Path getDir() {
        return Paths.get(".");
    }
}
