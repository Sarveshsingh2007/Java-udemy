import java.util.*;
public class mapInJava {
    public static void main(String args[]){
        Map<String, Integer> students = new HashMap<>();
        students.put("Sarvesh", 70);
        students.put("Shivam", 80);
        students.put("Arpit", 75);
        students.put("Sourabh", 90);

        System.out.println(students.keySet());

        for(String key : students.keySet()){
            System.out.println(key + ": " + students.get(key));
        }
    }
}
