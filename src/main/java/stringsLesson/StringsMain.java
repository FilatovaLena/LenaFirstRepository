package stringsLesson;

public class StringsMain {
    public static void main(String[] args) {
        StringsMain stringsMain = new StringsMain();
        int res = stringsMain.sumOfTwoNumbers (2,4);
        System.out.println("the result is " + res);
        System.out.println(stringsMain.getText());

    }
    public int sumOfTwoNumbers (int num1, int num2){
        int result = num1 + num2;
        return result;
//        System.out.println(num1 + num2);
    }
    public String getText (){
        return "bububu";
    }
}
