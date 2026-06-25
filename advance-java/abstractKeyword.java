abstract class Car{            // abstract class
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Music Playing..");
    }
}

abstract class Audi extends Car{       // abstract class - we can't create object of abstract class.
    public void drive(){
        System.out.println("Driving..");
    }
}

class AdvancedAudi extends Audi{       // Concrete class  - objects can be created.
    public void fly(){
        System.out.println("Flying..");
    }
}

public class abstractKeyword{
    public static void main(String[] args){
        Car obj = new AdvancedAudi();
        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}