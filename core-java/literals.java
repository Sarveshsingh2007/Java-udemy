class Literals {
    public static void main(String a[]) {

        // Binary Literal (prefix 0b)
        int num1 = 0b101;      // 5 in decimal

        // Hexadecimal Literal (prefix 0X or 0x)
        int num2 = 0X7E;       // 126 in decimal

        // Underscores for readability
        int num3 = 100_00_000; // 10000000

        // Integer assigned to double
        double num4 = 48;      // 48.0

        // Scientific Notation
        double num5 = 12e10;   // 12 × 10^10

        // Character Literal
        char c = 'a';
        c++;                   // becomes 'b'

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("c = " + c);
    }
}