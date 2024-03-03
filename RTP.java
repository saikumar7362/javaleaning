// in overring concept depend on object the output will display 
public class RTP {
    void msg(){
        System.out.println("paresnt class");
    }
}

class ChildRTP extends RTP {
    void msg(){
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        ChildRTP crtp = new ChildRTP();
        RTP rtp = new RTP();
        rtp.msg();
        crtp.msg();
    }
}
