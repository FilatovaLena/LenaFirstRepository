package stringsLesson;

public class FilatovaM4 {
    //  public String expectedString="Cat";

    public static void main(String[] args) {
        FilatovaM4 FilatovaM4 = new FilatovaM4();
        boolean success = FilatovaM4.compareStrings("Cat", "Cat");
               System.out.println("Login success " + success);

    }
      public boolean compareStrings(String a, String b) {

//       boolean success = false;
//        if (a.contains(b)){
//            System.out.println("Cat is the part of Category ");
//        } else if (a.equals(null) ||b.equals(null)) {
//            System.out.println("Can not compare Strings");
//        } else {
//            success = true;
//        }
//        return success;

        boolean success = false;
        if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        } else if (a.contains(b) && !a.equals(b)) {
            System.out.println("Cat is the part of Category");
        } else if (a.equals(b)) {
            System.out.println("The Strings are the same");
        } else {
            success = true;
        }
        return success;


    }
}


//    public void compareStrings() {
//       a = "Category";
//       b = "Cat";
//
//        System.out.println(a.contains(b));

