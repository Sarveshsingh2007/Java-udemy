@FunctionalInterface
interface A{
    void show(int i);
}

public class lemdaExpression {
    public static void main(String[] args){
        A obj = i -> System.out.println("int show" + i);
        obj.show(5);
    }
}
