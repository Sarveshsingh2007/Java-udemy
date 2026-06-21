package inheritance;

public class calculator {
    public static void main(String a[]){
    AdvCalc obj = new AdvCalc();
    int r1 = obj.add(4,5);
    int r2 = obj.subtract(5,4);
    int r3 = obj.mul(2,3);
    int r4 = obj.div(10,2);
    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
