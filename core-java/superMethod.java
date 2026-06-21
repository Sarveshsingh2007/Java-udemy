class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();    // super method
        System.out.println("in B");
    }
    public B(int n){
        this();     // this method
        System.out.println("in B int");
    }
}
public class superMethod {
    public static void main(String a[]){
        B obj = new B(6);
    }
}
