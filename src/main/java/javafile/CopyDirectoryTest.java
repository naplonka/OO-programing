package javafile;

import org.junit.Test;

import java.io.IOException;

class CopyDirectoryTest {

    @Test
    void srcExceptionMessage() throws IOException {
        CopyDirectory copyDirectory = new CopyDirectory();
        copyDirectory.copyDirectory("C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources", "C:\\Users\\natalia.rychlowska\\Desktop\\java OOPrograming\\src\\javafile\\resources");

    }
}
