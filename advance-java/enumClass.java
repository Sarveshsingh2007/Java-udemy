enum Laptop{
    Mackbook(2000), Thinkpad(1800), XPS, Surface(1500);

    private int price;

    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
        System.out.println("in Laptop" + this.name());
    }
    
}
public class enumClass {
    public static void main(String[] args){
        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
