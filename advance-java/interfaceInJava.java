interface A{
    int age = 20; // final and static 
    String Area = "Uttarakhand"; // final and static

    void show(); // abstract
    void config();  // abstract
}
class B implements A{
    public void show(){
        System.out.println("in show.");
    }
    public void config(){
        System.out.println("in config.");
    }
}
public class interfaceInJava{
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        // A.area = "Mumbai";        We can't modify final and static value.
        System.out.println(A.Area);
    }
}
