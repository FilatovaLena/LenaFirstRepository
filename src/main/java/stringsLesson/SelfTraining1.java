package stringsLesson;

import java.util.Scanner;

public class SelfTraining1 {

    public static void main(String[] args) {
        SelfTraining1 reverseString = new SelfTraining1();
        reverseString.reverseString("Hi");

    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("The String is empty or null");
        } else {
            System.out.println(String.format("Original word is %s", textToReverse));
            String result = "";
            int lastLetter = textToReverse.length() -1;
            for (int i = lastLetter; i >= -1; i--) {
                result = result + textToReverse ;

            }
            System.out.println(result);

        }
    }
}
