import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

    private int rollNo;
    private String name;

    public Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.rollNo- o.rollNo;
//    }

    public static void main(String[] args) {

        Student s1= new Student(10,"sachin");
        Student s2= new Student(74,"dhoni");
        Student s3= new Student(34,"sai");
        List<Student> studentList= new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Comparator<Student> s= (Student obj1, Student obj2) -> {
          //return obj1.name.compareTo(obj2.name);
            return obj1.rollNo - obj2.rollNo;
        };

        System.out.print("[");
        for(Student ob : studentList) {
            System.out.print(" " +ob.rollNo + " " + ob.name );
        }
        System.out.println("[");

        Collections.sort(studentList,s);

        System.out.print("[");
        for(Student ob : studentList) {
            System.out.print(" " +ob.rollNo + " " + ob.name );
        }
        System.out.println("]");



//        System.out.print("[");
//        for(Student s : studentList) {
//            System.out.print(" " +s.rollNo + " " + s.name );
//        }
//        System.out.println("]");
//        Collections.sort(studentList);
//        System.out.print("[");
//        for(Student s : studentList) {
//            System.out.print(" " +s.rollNo + " " +s.name);
//        }
//        System.out.println("]");
    }
}
