package javaleaning;

public class Overhidding {
   static void msg(){
        System.out.println("paresnt class");
    }
}

class ChildOverhidding extends Overhidding {
   static void msg(){
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        Overhidding oh = new ChildOverhidding();
        ChildOverhidding coh = new ChildOverhidding();
        oh.msg();
        coh.msg();
    }
}
