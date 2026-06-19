class Mobile{
    String brand;
    int price;
    static String name; // static variable = affects all the objects on changing one.
    
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticVariableAndMethods {
    public static void main(String args[]){
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 70000;
    Mobile.name = "Mobile-Phone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 60000;
    Mobile.name = "Mobile-Phone";
    
    obj1.show();
    obj2.show();

    Mobile.show1(obj1);
    }
}
