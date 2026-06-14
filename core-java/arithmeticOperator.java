public class arithmeticOperator {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 5;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Arithmetic Operators
        System.out.println("\n===== Arithmetic Operators =====");
        System.out.println("Addition       : " + (num1 + num2));
        System.out.println("Subtraction    : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division       : " + (num1 / num2));
        System.out.println("Modulus        : " + (num1 % num2));

        // Expression
        int num3 = num1 + 2;
        System.out.println("\nnum3 = num1 + 2");
        System.out.println("num3 = " + num3);

        // Compound Assignment
        System.out.println("\n===== Compound Assignment =====");
        System.out.println("Before num1 += 2 : " + num1);

        num1 += 2; // num1 = num1 + 2

        System.out.println("After num1 += 2  : " + num1);

        // Increment Operator
        System.out.println("\n===== Increment Operator =====");

        System.out.println("Before num1++ : " + num1);
        num1++;
        System.out.println("After num1++  : " + num1);

        // Pre Increment
        System.out.println("\n===== Pre Increment =====");

        int num = 7;

        System.out.println("Initial num = " + num);

        int result1 = ++num;

        System.out.println("result1 = ++num");
        System.out.println("num     = " + num);
        System.out.println("result1 = " + result1);

        // Post Increment
        System.out.println("\n===== Post Increment =====");

        int result2 = num++;

        System.out.println("result2 = num++");
        System.out.println("num     = " + num);
        System.out.println("result2 = " + result2);

        // Pre Decrement
        System.out.println("\n===== Pre Decrement =====");

        int x = 10;

        System.out.println("Initial x = " + x);

        int y = --x;

        System.out.println("y = --x");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Post Decrement
        System.out.println("\n===== Post Decrement =====");

        int p = 10;

        System.out.println("Initial p = " + p);

        int q = p--;

        System.out.println("q = p--");
        System.out.println("p = " + p);
        System.out.println("q = " + q);
    }
}