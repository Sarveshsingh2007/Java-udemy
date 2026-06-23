class A{
    public void show1(){
        System.out.println("in show A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in show B");
    }
}

public class upcastingDowncasting {
    public static void main(String a[]){
        A obj = new B(); // UPCASTING
        obj.show1();

        B obj1 = (B) obj; // DOWNCASTING
        obj1.show2();
    }
}
