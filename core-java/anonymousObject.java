class A{
    A(){
        System.out.println("in A constructor");
    }
    public void show(){
        System.out.println("in show");
    }
}

public class anonymousObject {
    public static void main(String a[]){
        new A();       // anonymous object
        new A().show();
    }
}
