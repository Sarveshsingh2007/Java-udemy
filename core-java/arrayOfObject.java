class Student{
    int rollno;
    String name;
    int marks;
}
public class arrayOfObject {
        public static void main(String[] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "sarvesh";
        s1.marks = 88;
        
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "sourabh";
        s2.marks = 90;
        
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "arpit";
        s3.marks = 100;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(int i=0;i<student.length;i++){
            System.out.println(student[i].rollno + ". " + student[i].name + ": "+ student[i].marks);
        }
    }
} 
