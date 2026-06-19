class Human{
    private int age;
    private String name;

    // default constructor
    public Human(){
        age = 20;
        name = "Sarvesh";
    }
    // parameterised constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){ // setter 
        this.age = age;
    }
    public int getAge(){ // getter
        return age;
    }
    public void setName(String name){ // setter 
        this.name = name;
    }
    public String getName(){ // getter
        return name;
    }
}

public class constructor {
    public static void main(String[] args){
        Human obj = new Human();
        Human obj1 = new Human(10, "jhon");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
