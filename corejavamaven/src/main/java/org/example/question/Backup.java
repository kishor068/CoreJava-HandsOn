package org.example.question;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class Backup {

    public static void main(String[] args) {
        String sourcePath = "C:/Users/Administrator/Desktop/main";
        String backupPath = "C:/Users/Administrator/Desktop/Backup";

        try {
            backupFolder(Paths.get(sourcePath), Paths.get(backupPath));
            System.out.println("Backup Completed Successfully");
        } catch (Exception e) {
            System.out.println("Backup Failed: " + e.getMessage());
        }
    }

    public static void backupFolder(Path source, Path destination) throws Exception {
        if (!Files.exists(source)) {
            throw new FileNotFoundException("Source folder not found: " + source.toString());
        }

        // Clear destination folder
        clearFolder(destination);

        try (Stream<Path> paths = Files.walk(source)) {
            paths.forEach(path -> {
                try {
                    Path targetPath = destination.resolve(source.relativize(path));
                    if (Files.isDirectory(path)) {
                        Files.createDirectories(targetPath);
                    } else {
                        Files.copy(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Error copying file: " + path.toString(), e);
                }
            });
        } catch (IOException e) {
            throw new IOException("Failed to walk source directory: " + e.getMessage(), e);
        }
    }

    public static void clearFolder(Path folder) throws IOException {
        if (!Files.exists(folder)) {
            Files.createDirectories(folder);
            return;
        }

        try (Stream<Path> paths = Files.walk(folder)) {
            paths.sorted(Comparator.reverseOrder())
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                        } catch (IOException e) {
                            throw new RuntimeException("Failed to delete: " + path.toString(), e);
                        }
                    });
        }
    }
}
