package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
        Lesson2MainLoops loops  = new Lesson2MainLoops();
        loops.countNumbers(3);
    }

    public void countNumbers(int i) {
        System.out.println(i);
        System.out.println(i+1);
        System.out.println(i+2);

        while (i <= 100) {
            System.out.println(i);
            i = i + 10;



        }
    }
}
