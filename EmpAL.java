import java.util.*;
public class EmpAL {
    int EmpId;
    String EmpName;
    int EmpAge;
        class EmpAL(int EmpId, String EmpName, int EmpAge){
            this.EmpId = EmpId;
            this.EmpName = EmpName;
            this.EmpAge = EmpAge;

        }
        //userdefine arraylist
        class UdarrayList{
            public static void main(String[] args){
                //careation of Object
           EmpAL oe = new EmpAL(123,"sai", 29);
           EmpAL oe2 = new EmpAL(456,"Reshma",22);     
           //creating ArrayList
           ArrayList<EmpAL> a1 = new ArrayList<EmpAL>();
                //adding elements to Arraylist
                a1.add(oe);
                a1.add(oe2);
                //iterator
                iterator i = a11.iterator();
                while(i.hasNext()){
                    //EmpAL object create cheysee dhavara  onebyone creating by using Emp
                    EmpAL Emp = (EmpAL)i.next();
                    System.out.println(Emp.EmpId+" "+Emp.EmpName+" "+Emp.EmpAge);

                }
            }
        }
}
