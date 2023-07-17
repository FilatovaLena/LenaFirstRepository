package stringsLesson;

public class Enes {
    public String expectedStringA="Cat";
    public String expectedStringB="Category";




    public static void main(String[] args) {
    Enes enes = new Enes();
   boolean Result = enes.compeareString("Cat","Category");
        System.out.println("This is a "+Result); // true or false


}
public boolean compeareString (String a,String b) {
        boolean Result = false;
    if (expectedStringA==a) {
        System.out.println("They are equal");
    } else if (a==b){
        System.out.println("They are not equal");
    }else {
        Result = true ;
    }
    return Result;
}


}