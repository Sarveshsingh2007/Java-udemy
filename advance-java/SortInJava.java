import java.util.*;
public class SortInJava{
    public static void main(String[] args){
         {
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(80);
        nums.add(89);
        nums.add(43);

        Collections.sort(nums, com);
        System.out.println(nums);
        
    }
}
}
