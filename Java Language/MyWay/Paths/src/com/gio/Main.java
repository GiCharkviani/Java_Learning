package com.gio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
           try {
               Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
               long size = Files.size(filePath);
               System.out.println("Size = " + size);
               System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

               BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
               System.out.println("Size = " + attributes.size());
               System.out.println("Last modified = " + attributes.lastModifiedTime());
               System.out.println("Created = " + attributes.creationTime());
               System.out.println("Is directory = " + attributes.isDirectory());
               System.out.println("Is regular file = " + attributes.isRegularFile());

//               Path dirToCreate = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
//               Files.createDirectories(dirToCreate);

//               Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6/");
//               Files.createDirectories(dirToCreate);

//               Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir6");
//               Files.createDirectory(dirToCreate);

//               Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file3.txt");
//               Files.createFile(fileToCreate);

//               Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//               Files.deleteIfExists(fileToDelete);

//               Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//               Path destination = FileSystems.getDefault().getPath("Examples", "file2.txt");
//               Files.move(fileToMove, destination);

//               Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//               Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//               Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

//               sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//               copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//               Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

           } catch (IOException e) {
               System.out.println(e.getMessage());
           }
    }
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = FileSystems.getDefault().getPath(".","files","SubdirectoryFile.txt");
//        printFile(filePath);
//
//        // if outside root directory:
//        filePath = Paths.get("/Users/giorgi.charkviani/Desktop/Learning/Java/OutThere.txt");
//        printFile(filePath);
//
//        System.out.println("\n****");
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath()); // prints current absolute path
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        // Path to file that doesn't exist
//        Path path3 = FileSystems.getDefault().getPath("iDontExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("/Users/giorgi.charkviani/Desktop/Learning/Java/inThere.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//
//        System.out.println("Exists = " + Files.exists(path4));
//    }
//
//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
