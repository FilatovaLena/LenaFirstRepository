package lesson1;

public class FilatovaM2 {
//   Expected Output :
//Hello
//Vasiliy Pupkin
//
//2. Write a Java program to print the result of the following operations.
//a. -5 + 8 * 6
//b. 20 + -3*5 / 8
//
//3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
//
//number a * number b *.... equals <result>
//
//
//
//Attach class with the solution to this lesson. You can drag and drop the file from the IDEA or save it to the text file.

    public static void main(String[] args) {
        String txt = "1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.";
        String txtToPrint = "Hello!";
        String MyName = "Elena Filatova";
        System.out.println(txt = "1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.");
        System.out.println(txtToPrint = "Hello!");
        System.out.println(MyName = "Elena Filatova");

        String txt1 = "2. Write a Java program to print the result of the following operations.";
        System.out.println(txt1 = "2. Write a Java program to print the result of the following operations." );

        int a = -5;
        int b = 8;
        int c = 6;
        int result1= (int) a + b * c;
        System.out.println("a + b * c = " + result1);
        System.out.println("-5 + 8 * 6 = " + result1);

        String txt2 = "3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format";
        System.out.println(txt2 = "3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format");


        int x = 20;
        int y = -3;
        int z = 5;
        int h = 8;
        double result2 = (double) x + y * z / h;
        int result = (int) x + y * z / h;
        System.out.println("x + y * z / h = " + result2 );
        System.out.println("20 + -3 * 5 / 8 = " + result2 );
        System.out.println("20 + -3 * 5 / 8 = " + result );




        double a1 = 1.2;
        double b1 = 2.5;
        double c1 = 3.4;
        double d1 = 4.6;
        double e1 = 7.8;
        double result3 = (double) a1 * b1 * c1 * d1 * e1;
        System.out.println("result is " + result3);
        System.out.println("a * b * c * x * y = " + result3);
        System.out.println("number a * number b * number c * number x * number y = " + result3);
        System.out.println("1.2 * 2.5 * 3.4 * 4.6 * 7.8 = " + result3);



    }
}
