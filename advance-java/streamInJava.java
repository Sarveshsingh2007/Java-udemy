import java.util.*;
public class streamInJava {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(2,6,4,3,7,8,9);

        
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n->n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        // System.out.println(result);

        int result = nums.stream()
                        .filter(n-> n%2 == 0)
                        .map(n-> n*2)
                        .reduce(0, (c,e) -> c+e);
        
        System.out.println(result);
    }
}
