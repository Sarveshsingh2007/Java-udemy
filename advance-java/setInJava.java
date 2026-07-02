import java.util.*;
public class setInJava{
    public static void main(String a[]){ // Set don't contain duplicate values and don't give sorted output.
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}