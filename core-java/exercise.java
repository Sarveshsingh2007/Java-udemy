public class exercise {
    public static void main(String[] args){
         // write code here
         int a = 20;
         int b = 10;
        //  int addition = a+b;
         System.out.println("Addition: "+ (a+b));
         int subtraction = a-b;
         System.out.println("Subtraction: "+ subtraction);
         int multiplication = a*b;
         System.out.println("Multiplication: "+ multiplication);
         int division = a/b;
         System.out.println("Division: "+ division);
         boolean result1 = a>b;
         System.out.println("Is a greater than b? "+ result1);
         boolean result2 = a>b && b>0;
         System.out.println("Is a > b and b > 0? "+ result2);
    }
}