package stringsLesson;

public class Palindrome {
    //    racecar
    public static void main(String[] args) {


        String original = "racecar";
        String reverse = "";
        String palindrome = original;

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }

        if (palindrome.equals(reverse)) {
            System.out.println("string is Palindrome");
//            return true;

        } else {
            System.out.println("String is not Palindrome");
//            return false;
        }
//                   return true;
    }

    }











