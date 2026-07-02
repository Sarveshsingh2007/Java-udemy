import java.util.ArrayList;
import java.util.List;

public class arraylistinJava{
    public static void main(String a[]){
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        System.out.println("Index of 4: " + nums.indexOf(4));
        System.out.println("value at index 2: " + nums.get(2));
        for(Integer n : nums){
            System.out.println("number: " + n);
        }
    }
}