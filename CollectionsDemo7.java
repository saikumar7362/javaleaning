import java.util.*;
class Student{
    int rollNo;
    String name, address;
    Student(int rollNo, String name, String address){
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;

    }
}
 class CollectionsDemo7 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Adabala", "Kesanapalli");
        Student s2 = new Student(2, "Lakshmi", "Kesudasupalam");
        Student s3 = new Student(3, "Narasimha", "Narasapuram");
        Student s4 = new Student(4, "Kumar", "Vijayavada");

            List<Student> list = new ArrayList<>();
                list.add(s1);
                list.add(s2);
                list.add(s3);
                list.add(s4);

                for(Student  s: list){
                    System.out.println(s.rollNo+" "+s.name+" "+s.address);
                }
    }
    
}
