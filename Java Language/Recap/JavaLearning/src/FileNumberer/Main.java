package FileNumberer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private static final String tutorWay = "/Users/giorgi.charkviani/Desktop/Learning/Java/Java_Learning/Java Language/TutorWay/";
    public static void main(String[] args) {
        for (int i = 5; i<= 28; i++) {
            renameTo1("section" + i);
        }
    }

    private static void deleteSlidesIfEmpty(String section) {
        File file = new File(tutorWay + section + "/Slides");
        File[] files = file.listFiles();

        if(files.length == 0) {
            file.delete();
        }
    }

    private static void renameTo1(String section) {
        File file = new File(tutorWay + section + "/Slides");
        if(file.exists()) {
            String newName = String.format("1.%s", file.getName());
            File newFile = new File(file.getParent(), newName);

            file.renameTo(newFile);
        }
    }

    private static void nameNumberFilesByCreationDate() {
        String  directory = tutorWay + "section4";


        File dir = new File(directory);
        File[] files = dir.listFiles((d, name) -> name.endsWith(".pptx"));

        if (files != null && files.length > 0) {
            int count = 1;
            Arrays.sort(files, Comparator.comparingLong(File::lastModified));

            for (File file : files) {
                String newName = String.format("%d. %s", count++, file.getName());
                File newFile = new File(file.getParent(), newName);

                if (!file.renameTo(newFile)) {
                    System.out.println("Failed to rename file: " + file.getName());
                } else {
                    System.out.println("Renamed to: " + newName);
                }
            }
        }
    }


    public static void cutAndMoveFilesToSlides(String section) {
        File sourceDir = new File(tutorWay + section); // Source directory path
        File targetDir = new File(tutorWay + section + "/Slides"); // Target directory path

        // Create target directory if it doesn't exist
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }

        // List all files in the source directory
        File[] files = sourceDir.listFiles();
        if (files != null) {
            for (File file : files) {
                // Check if the file is a .pptx file
                if (file.isFile() && file.getName().endsWith(".pptx")) {
                    // Define the target file path
                    File targetFile = new File(targetDir, file.getName());
                    try {
                        // Move the .pptx file to the target directory
                        Files.move(file.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Moved: " + file + " -> " + targetFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
