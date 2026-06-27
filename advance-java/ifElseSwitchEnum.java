enum Status{
    Running, Pending, Failed, Success;
}
public class ifElseSwitchEnum {
    public static void main(String[] args){
        Status s = Status.Running;
        if(s== Status.Pending){
            System.out.println("Pocesss Pending..");
        }else if(s == Status.Failed){
            System.out.println("Process Failed");
        }else if(s == Status.Running){
            System.out.println("Process Running");
        }else{
            System.out.println("Process Done.");
        }
        Status s1 = Status.Success;
        switch(s1){
            case Running:
                System.out.println("Process Running");
                break;
            case Pending:
                System.out.println("Process Pending");
                break;
            case Failed:
                System.out.println("Process Failed");
                break;
            default:
                System.out.println("Done.");
        }
    }
}
