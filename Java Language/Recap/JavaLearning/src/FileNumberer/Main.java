package FileNumberer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


    }

    private static void renameFiles() {
        String  directory = "/Users/giorgi.charkviani/Desktop/Learning/Java/Java_Learning/Java Language/TutorWay/section4";


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
        Path sourceDir = Paths.get("/Users/giorgi.charkviani/Desktop/Learning/Java/Java_Learning/Java Language/TutorWay/" + section); // Source directory path
        Path targetDir = Paths.get("/Users/giorgi.charkviani/Desktop/Learning/Java/Java_Learning/Java Language/TutorWay/" + section + "/Slides"); // Target directory path

        try {
            // Create the target directory if it doesn't exist
            Files.createDirectories(targetDir);

            // Use try-with-resources to ensure that the stream is closed
            try (Stream<Path> files = Files.walk(sourceDir)) {
                files.filter(file -> file.toString().endsWith(".pptx"))
                        .forEach(file -> {
                            try {
                                // Construct the target file path
                                Path targetFile = targetDir.resolve(sourceDir.relativize(file));
                                // Move the .pptx file to the new directory
                                Files.move(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("Moved: " + file + " -> " + targetFile);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
