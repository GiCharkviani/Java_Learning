package FileNumberer;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String directory = "/Users/giorgi.charkviani/Desktop/Learning/Java/Java_Learning/Java Language/TutorWay/section11";
        File dir = new File(directory);
        File[] files = dir.listFiles((d, name) -> name.endsWith(".pptx"));
        File[] directories = dir.listFiles((d, name) -> !name.endsWith(".pptx"));

        if (files != null && files.length > 0) {
            renameFiles(files);
        }
//        if (directories != null && directories.length > 0) {
//            renameFiles(directories);
//        }

    }

    private static void renameFiles(File[] files) {
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
