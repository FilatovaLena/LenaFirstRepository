package stringsLesson;

//Given a string, take the last char and return a new string with the last char added at the beginning and the end,
// so "dog" will become "gdogg". The original string should be length 1 or more.
//dog --> g dog g
//get last letter (length-1) add as first letter of result of he nwe world
public class SelfTraining {
    public static void main(String[] args) {
        SelfTraining reverseString = new SelfTraining();
        reverseString.reverseString("xy");

    }

    public void reverseString(String textToReverse) {
        if (textToReverse == null || textToReverse.isEmpty() || textToReverse.isBlank()) {
            System.out.println("The String is empty or null");
        } else {
            System.out.println(String.format("Original word is %s", textToReverse));
            String result = "";
            int lastLetter = textToReverse.length() - 1;
            for (int i = lastLetter; i>=1; i--){
                result = result + textToReverse.charAt(i) + textToReverse + textToReverse.charAt(i);
                System.out.println();

            }
            System.out.println(result);
        }
    }


}
