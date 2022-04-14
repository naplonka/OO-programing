package javafile;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DeleteFile {
    private static String dltExceptionMessage(File file) {
        return "Delete " + file + " does not exist.";
    }

    private DeleteFile() {
    }

    public static void deleteDirectory(String delete) throws IOException {
        File dltDirectory = new File(delete);
        if (!dltDirectory.exists()) {
            throw new FileNotFoundException(dltExceptionMessage(dltDirectory));
            //            log.error("Directory " + dltDirectory + " was not deleted.");
        }
        FileUtils.deleteDirectory(dltDirectory);
//            log.info("Directory " + dltDirectory + " was deleted.");

    }

    public void deleteFileString(String delete) throws FileNotFoundException {
        File dltFile = new File(delete);
        if (!dltFile.exists()) {
            throw new FileNotFoundException(dltExceptionMessage(dltFile));
        }
        try {
            FileUtils.forceDelete(dltFile);
//            log.info("File " + dltFile + " was deleted.");
        } catch (IOException e) {
            e.printStackTrace();
//            log.error("File " + dltFile + " was not deleted.");
        }
    }
}
