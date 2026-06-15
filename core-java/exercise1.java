public class exercise1 {
    public static void main(String[] args) {

        // For Loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        // While Loop
        int a = 1;
        System.out.print("While Loop: ");
        while (a <= 5) {
            System.out.print(" " + a);
            a++;
        }

        System.out.println("\n");

        // Do-While Loop
        int b = 1;
        System.out.print("Do-While Loop: ");
        do {
            System.out.print(" " + b);
            b++;
        } while (b <= 5);

        System.out.println();
    }
}