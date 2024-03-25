import java.util.*;

class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<Student> ll = new LinkedList<>();
        ll.add(new Student(24));
        ll.add(new Student(35));
        Iterator<Student> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

class Student {
    int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString() {
        return Integer.toString(rollNo);
    }
}
