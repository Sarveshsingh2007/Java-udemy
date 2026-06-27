enum Status{
    Running, Failed, Pending, Success;
}
public class enumInJava{
    public static void main(String[] args){
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        
        Status[] ss = Status.values();
        for(Status s1 : ss){
            System.out.println(s1 + " : " + s1.ordinal());
        }
    }
}