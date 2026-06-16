public class exercise2 {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        // Run the loop while 'again' equals 'y'
        while (again.equals("y")) {

            double result = 0;

            // Perform the calculation based on the operator
            if (operator == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);

            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);

            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);

            } else if (operator == '/') {

                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }

            } else {
                System.out.println("Invalid operator.");
            }

            // Stop the loop after one execution
            again = "n";
        }

        // Thank you message
        System.out.println("Thank you for using the calculator.");
    }
}