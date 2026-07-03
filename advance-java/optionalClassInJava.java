import java.util.*;
public class optionalClassInJava {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sarvesh", "Shivam", "Ajay", "Sagar");
        String name = names.stream()
                                .filter(str-> str.contains("x"))
                                .findFirst()
                                .orElse("Not found.");

        Optional<String> name2 = names.stream()
                                .filter(str-> str.contains("y"))
                                .findFirst();

        System.out.println(name + " " + name2.get());                        
    }
}  
    