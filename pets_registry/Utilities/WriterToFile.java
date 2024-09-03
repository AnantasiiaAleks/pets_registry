package Utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriterToFile {

    public static void writeToFile(String text, String filePath) {
        Path path = Paths.get(filePath);
        try {
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(text);
            writer.append("\n");
            System.out.println("File is created successfully with the content.");
        } catch (IOException e) {
            e.printStackTrace();
        }



//        try {
//
//            FileWriter fileWriter = new FileWriter(filePath, true);
//            fileWriter.write(text);
//            fileWriter.append("\n");
//            fileWriter.flush();
//            fileWriter.close();
//            System.out.println("File is created successfully with the content.");
//        }
//        catch (IOException e) {
//            System.out.print("Writting error");
//        }
    }

}
