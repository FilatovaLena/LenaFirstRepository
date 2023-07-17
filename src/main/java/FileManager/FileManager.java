package FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        String file = "Legion.txt";
        FileManager fileManager = new FileManager();
        fileManager.createFile(file);
        fileManager.writeToFile(file, "\"There is a constitutional basis for a woman’s right to terminate a pregnancy the Supreme Court (SCOTUS)\\n\" +\n" +
                "//            \" has not directly addressed – the 13th Amendment, which abolished slavery and involuntary servitude. Several op-eds over the past\\n\" +\n" +
                "//            \" several decades have argued government-forced pregnancy is slavery.\\n\" " +
                "//            \" A few months ago, a federal judge suggested that possibility, but it’s not the first time a court has given serious\\n \" +\n" +
                "//  \"consideration to the question.\"");

    }
    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void writeToFile(String fileName, String text){

        try {

            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("err");
            throw new RuntimeException(e);

        }

    }


    }



