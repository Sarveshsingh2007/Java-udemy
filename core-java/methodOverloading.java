class Calculator{
    public int add(int n1, int n2){
        return n1+ n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
}

public class methodOverloading {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        double r1 = obj.add(5.3, 3);
        System.out.println(r1);
    }
}
