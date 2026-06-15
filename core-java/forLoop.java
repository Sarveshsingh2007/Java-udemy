public class forLoop {
    public static void main(String[] args) {

        // Basic For Loop
        System.out.println("=== Basic For Loop ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Nested For Loop
        System.out.println("\n=== Nested For Loop (Weeks and Days) ===");

        for (int week = 1; week <= 4; week++) {

            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("  Day " + day);
            }

            System.out.println();
        }

        System.out.println("Program Ended");
    }
}