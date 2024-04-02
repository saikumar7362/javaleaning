import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employeee implements Serializable{
    int rollNo;
    String name;
    Employeee(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Employeee e1 = new Employeee(7362, "Saikumar");
            try{
                FileOutputStream fout = new FileOutputStream("C:\kumar.txt");
                ObjectOutputStream out = new ObjectOutputStream(fout);
                out.writeObject(e1);
                out.close();
                fout.close();
                System.out.println("Success");
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}
