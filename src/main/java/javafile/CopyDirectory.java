package javafile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyDirectory {

    String srcExceptionMessage(File file) {
        return "Source " + file + " does not exist.";
    }

    String dscExceptionMessage(File file) {
        return "Destination " + file + " does not exist.";
    }

    public void copyDirectory(String source, String destination) throws IOException {
        File srcDirectory = new File(source);
        File dscDirectory = new File(destination);
//        if (!srcDirectory.exists()) {
//            throw new FileNotFoundException(srcExceptionMessage(srcDirectory));
//        }
//        if (!dscDirectory.exists()) {
//            throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
//        }
        try {
            FileUtils.copyDirectoryToDirectory(srcDirectory, dscDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveDirectory(String source, String destination) throws IOException {
        File srcDirectory = new File(source);
        File dscDirectory = new File(destination);
        if (!srcDirectory.exists()) {
            throw new FileNotFoundException(srcExceptionMessage(srcDirectory));
        }
        if (!dscDirectory.exists()) {
            throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
        }
        FileUtils.moveDirectoryToDirectory(srcDirectory, dscDirectory, false);
    }

    public void copyFileToDirectory(String source, String destination) throws IOException {
        File srcFile = new File(source);
        File dscDirectory = new File(destination);
        if (!srcFile.exists()) {
            throw new FileNotFoundException(srcExceptionMessage(srcFile));
        }
        if (!dscDirectory.exists()) {
            throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
        }
        FileUtils.copyFileToDirectory(srcFile, dscDirectory);
    }

    public void moveFileToDirectory(String source, String destination) throws IOException {
        File srcFile = new File(source);
        File dscDirectory = new File(destination);
        if (!srcFile.exists()) {
            throw new FileNotFoundException(srcExceptionMessage(srcFile));
        }
        if (!dscDirectory.exists()) {
            throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
        }
        FileUtils.moveFileToDirectory(srcFile, dscDirectory, false);
    }

    public void copyAllFilesToDirectory(String source, String destination) throws IOException {
        File srcDirectory = new File(source);
        if (!srcDirectory.exists()) {
            throw new FileNotFoundException(srcExceptionMessage(srcDirectory));
        }
        File[] files = srcDirectory.listFiles();

        for (File file : files) {
            File dscDirectory = new File(destination);
            if (!file.exists()) {
                throw new FileNotFoundException(srcExceptionMessage(file));
            }
            if (!dscDirectory.exists()) {
                throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
            }
            FileUtils.copyFileToDirectory(file, dscDirectory, false);
        }
    }

    public void moveAllFilesToDirectory(String source, String destination) throws IOException {
        File srcDirectory = new File(source);
        if (!srcDirectory.exists()) {
            throw new FileNotFoundException(srcExceptionMessage(srcDirectory));
        }
        File[] files = srcDirectory.listFiles();

        for (File file : files) {
            File dscDirectory = new File(destination);
            if (!file.exists()) {
                throw new FileNotFoundException(srcExceptionMessage(file));
            }
            if (!dscDirectory.exists()) {
                throw new FileNotFoundException(dscExceptionMessage(dscDirectory));
            }
            FileUtils.moveFileToDirectory(file, dscDirectory, false);
        }
    }
}
