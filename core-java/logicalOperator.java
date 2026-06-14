public class logicalOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\n===== Logical AND (&&) =====");

        System.out.println("(a > b) && (c > a) : " + ((a > b) && (c > a)));
        System.out.println("(a < b) && (c > a) : " + ((a < b) && (c > a)));

        System.out.println("\n===== Logical OR (||) =====");

        System.out.println("(a > b) || (a > c) : " + ((a > b) || (a > c)));
        System.out.println("(a < b) || (a > c) : " + ((a < b) || (a > c)));

        System.out.println("\n===== Logical NOT (!) =====");

        boolean result = (a > b);

        System.out.println("result      : " + result);
        System.out.println("!result     : " + (!result));

        System.out.println("\n===== Real-Life Example =====");

        int age = 20;
        boolean hasID = true;

        System.out.println("Age = " + age);
        System.out.println("Has ID = " + hasID);

        boolean allowedEntry = (age >= 18) && hasID;

        System.out.println("Allowed Entry = " + allowedEntry);
    }
}