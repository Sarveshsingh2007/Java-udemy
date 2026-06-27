interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run: Faster");
    }
}
class Developer{
    public void developApp(Computer lap){
        lap.code();
    }
}
public class needOfInterface{
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer sarvesh = new Developer();
        sarvesh.developApp(lap);
        sarvesh.developApp(desk);
    }
}