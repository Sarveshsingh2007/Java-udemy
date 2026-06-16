class Calculator{            // creating class 
    int a;
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}


public class classAndObjects{
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 2;
        Calculator calc = new Calculator(); // creating object
        int result = calc.add(num1, num2);
        System.out.println("Sum of num1 and num2 is: "+ result);
    }
}