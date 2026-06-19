class Human{
    private int age;
    private String name;

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

public class encapsulation {
    public static void main(String[] args){
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Sarvesh");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
