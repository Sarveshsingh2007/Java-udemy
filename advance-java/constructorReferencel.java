import java.util.*;

class Student{
    private String name;
    private int age;

    public Student(){}

    public Student(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}

public class constructorReferencel {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Sarvesh", "Ajay", "Shivam");
        
        List<Student> students = new ArrayList<>();
        
        // for(String name : names){
        //     student.add(new Student(name));
        // }

        // students = names.stream()
        //                     .map(name -> new Student(name))
        //                     .toList();
        
        students = names.stream()
                            .map(Student::new)
                            .toList();
        
        System.out.println(students);
    }   
}
