package javafile;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;


public class FileCopy {
    List<String> jres = List.of("jdk1.8.0_201", "jre1.8.0_211");

//    @Parameterized.Parameters


//    public static List<Object[]> jre() {
//        return Arrays.asList(new Object[][] {
//                { "jdk1.8.0_201", true },
//                { "jre1.8.0_211", true }
//        });
//    }
//    String jre;


    File appPath = new File("C:\\Airbus\\L7.1.1_RC1_for_Jeppesen");
    File jrePathInApp = new File("C:\\Airbus\\L7.1.1_RC1_for_Jeppesen\\jre");


    @Test
    public void copyJreToApp() throws IOException {
        for (String jre : jres) {


            String jrePath = String.format("C:\\Program Files\\Java\\%s", jre);
            File jreFile = new File(jrePath);
            System.out.println("starting iteration");

            //Remove jre if exist
            if (Files.exists(jrePathInApp.toPath())) {
                Files.walk(jrePathInApp.toPath())
                        .sorted(Comparator.reverseOrder())
                        .map(Path::toFile)
                        .forEach(File::delete);
                System.out.println("delete existing jre");
            }
            String copiedJreToApp = String.format(appPath + "\\%s", jre);
            File copiedJreDirectory = new File(copiedJreToApp);
            System.out.println(copiedJreToApp);
            if (!copiedJreDirectory.exists()) {
                //copy jre to app
                FileUtils.copyDirectoryToDirectory(jreFile, appPath);
                System.out.println("copied java/jre to app");
            }

            Path sourceJrePathInApp = Paths.get(copiedJreToApp);
            //Rename jre in path
            if (copiedJreDirectory.exists()) {
                jrePathInApp.deleteOnExit();
                Files.move(sourceJrePathInApp, sourceJrePathInApp.resolveSibling("jre"));
                System.out.println("renamed copied jre in app");
            }
        }}
    }



