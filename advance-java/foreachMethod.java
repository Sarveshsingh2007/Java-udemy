import java.util.*;
import java.util.Arrays;

public class foreachMethod {
    public static void main(){
        List<Integer> nums = Arrays.asList(2,3,4,8,6,5);
        nums.forEach(n -> System.out.println(n));
    }
}
