class A{
    public void showIAmInThisClass(){
        System.out.println("in A class.");
    }
}
class B extends A{
    @Override            // ANNOTATION
    public void showIAmInThisClass(){
        System.out.println("in B class.");
    }
}

public class annotation {
    public static void main(String[] args){
        A obj = new B();
        obj.showIAmInThisClass();
    }
}
