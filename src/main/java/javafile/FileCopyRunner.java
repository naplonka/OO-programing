package javafile;

import java.io.IOException;

public class FileCopyRunner {
    public static void main(String[] args) throws IOException {
//        FileCopy fileCopy = new FileCopy();
//        fileCopy.copyJreToApp();
        CopyDirectory copyDirectory = new CopyDirectory();
        RenameOperation renameOperation = RenameOperation.getInstance();
//        renameOperation.renameDirectory("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\sourc", "C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\source");
//        DeleteFile.deleteDirectory("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\sourcess");
//        deleteFile.deleteFile("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources\\test.txt");


        renameOperation.renameFile("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources\\fileTo.txt", "C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources\\fileToTest.txt");
    }
}
