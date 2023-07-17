package FilatovaM7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GameManager {


    public static void main(String[] args) {
        GameManager fileManager = new GameManager();

        String file = "SOCCER.txt";
        fileManager.createFile(file);
        fileManager.writeToFile(file, "12");

        String file1 = "HOCKEY.txt";
        fileManager.createFile1(file1);
        fileManager.writeToFile1(file1, "6");

        String file2 = "RUGBY.txt";
        fileManager.createFile1(file2);
        fileManager.writeToFile1(file2, "15");


    }

    public void createFile(String fileName) {
        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }
    }

    public void createFile1(String fileName) {
        File file1 = new File(fileName);

        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToFile1(String fileName, String text) {

        try {

            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
            public void createFile2 (String fileName) {
                File file = new File(fileName);

                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            public void writeToFile2(String fileName, String text){

                    try {
                        FileWriter fileWriter = new FileWriter(fileName);
                        fileWriter.write(text);
                        fileWriter.close();

                    } catch (IOException e) {

                        throw new RuntimeException(e);

                    }
                }

    }
