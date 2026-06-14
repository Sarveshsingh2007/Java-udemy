public class typeconversion{
    public static void main(String[] args) {

        // Implicit Type Conversion (Widening)
        byte b = 127;
        int num = b;
        System.out.println("byte to int: " + num);

        // Explicit Type Conversion (Casting)
        int c = 12;
        byte d = (byte) c;
        System.out.println("int to byte: " + d);

        // Float to int
        float e = 5.6f;
        int f = (int) e;
        System.out.println("float to int: " + f);

        // Type Promotion
        byte g = 10;
        byte h = 30;

        // g and h are promoted to int before multiplication
        int result = g * h;
        System.out.println("Result: " + result);
    }
}