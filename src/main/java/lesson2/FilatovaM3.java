package lesson2;

public class FilatovaM3 {
    public static void main(String[] args) {
        FilatovaM3 loops = new FilatovaM3();
        loops.oddNumbers();
        loops.evenNumbers();
        loops.threeNumbers();
        loops.threeTwoNumbers();
        loops.numbersTemplate(30);
        loops.countNumbers();

    }

    public void oddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                i = i + 0;
                System.out.println("The number is odd. " + i);
            }
        }
    }

    public void evenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                i = i + 0;
                System.out.println("The number is even. " + i);

            }
        }
    }

    public void threeNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                i = i + 0;
                System.out.println("The number is divisible by three. " + i);
            }
        }
    }

    public void threeTwoNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 2 == 0) {
                i = i + 0;
                System.out.println("The number is divisible by three and two. " + i);
            }
        }
        System.out.println();
    }

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= 30; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void countNumbers() {
        int x = 2;
        int y = 4;
        if (y <= 10) {
            int z = (y - x);
            z++;
            int c = z + y + x;
            System.out.println(" 2 + 3 + 4 = " + c);
        }

    }

}



