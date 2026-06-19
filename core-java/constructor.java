class Human{
    private int age;
    private String name;

    // constructor
    public Human(){
        age = 20;
        name = "Sarvesh";
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
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
