import java.util.*;
public class methodReference {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sarvesh", "Ajay", "Shivam");
        List<String> Unames = names.stream()
                                    .map(String::toUpperCase)
                                    .toList();

        System.out.println(Unames);

        // for each
        Unames.forEach(System.out::println);
    }   
}
