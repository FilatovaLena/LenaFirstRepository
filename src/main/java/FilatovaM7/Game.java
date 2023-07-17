package FilatovaM7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static String writeNumOfPlayersPerTeam(GameType game) {
        String result = "";

        switch (game) {
            case SOCCER:
                String fileName = "SOCCER.txt";
                File file = new File(fileName);

                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {

                    FileWriter fileWriter = new FileWriter(fileName);
                    String text = "11";
                    fileWriter.write(text);
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
                result = "11";
                break;


            case HOCKEY:
                String fileName1 = "HOCKEY.txt";
                File file1 = new File(fileName1);

                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {

                    FileWriter fileWriter = new FileWriter(fileName1);
                    String text = "6";
                    fileWriter.write(text);
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
                result = "6";
                break;

            case RUGBY:
                String fileName2 = "RUGBY.txt";
                File file2 = new File(fileName2);

                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {

                    FileWriter fileWriter = new FileWriter(fileName2);
                    String text = "15";
                    fileWriter.write(text);
                    fileWriter.close();

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
                result = "15";
                break;

        }


            return result;
        }
    }


