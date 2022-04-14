package javafile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/javafile/resources/test.txt");

//        System.out.println(path);

//        File file = new File("resources\\test.txt");
//        System.out.println(file.list());

        Files.lines(path).forEach(System.out::println);
    }
}
