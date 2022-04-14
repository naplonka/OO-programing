package javafile;

import java.io.File;

public class RenameOperation {

    String srcExceptionMessage(File file) {
        return "Source " + file + " does not exist.";
    }

    private RenameOperation() {
    }

    public void rename(String source, String destination) {
        File srcPath = new File(source);
        File dstPath = new File(destination);
        if (!srcPath.exists()) {
        } else {
            try {
                srcPath.renameTo(dstPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
