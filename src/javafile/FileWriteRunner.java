package javafile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {

//        Path fileToWrite = Paths.get("resources", "fileto.txt");
        File fileToWrite = new File("resources\\fileto.txt");

        List<String> list = List.of("Apple", "Boy", "Dog", "Elephant");

        Path path = Paths.get("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources\\fileTo.txt");


        Files.write(path, list);
        Files.lines(path)
                .map(String::length);

    }
}
