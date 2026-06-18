public class StringBufferDemo {
    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Sarvesh");

        // Capacity and Length
        System.out.println("String: " + sb);
        System.out.println("Capacity: " + sb.capacity()); // default capacity 16 + capacity of sb
        System.out.println("Length: " + sb.length());

        // Append
        sb.append(" Singh");
        System.out.println("\nAfter append(): " + sb);

        // Convert to String
        String str = sb.toString();
        System.out.println("Converted String: " + str);

        // Delete Character
        sb.deleteCharAt(2);
        System.out.println("\nAfter deleteCharAt(2): " + sb);

        // Insert String
        sb.insert(0, "Java ");
        System.out.println("After insert(): " + sb);

        // Set Length
        sb.setLength(30);
        System.out.println("\nAfter setLength(30):");
        System.out.println("Length: " + sb.length());

        // Ensure Capacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): "
                + sb.capacity());

        // Reverse
        StringBuffer sb2 = new StringBuffer("Java");
        sb2.reverse();
        System.out.println("\nReverse of Java: " + sb2);
    }
}