public class ifelse{
    public static void main(String args[]){
        int x = 7;
        if(x>8){
            System.out.println("yes 12 is greater than 8."); // Use curley braces while having 2 or more statements
            System.out.println("Thankyou.");
        }
        else
            System.out.println("No Answer is wrong, Sorry.");

        
        System.out.println("======GREATEST OF 3======");

        int a = 9;
        int b = 10;
        int c = 7;
        if(a>b && a>c)
            System.out.println("A is Greater.");
        else if(b>a && b>c)
            System.out.println("B is Greater.");
        else
            System.out.println("C is Greater.");
    }
}