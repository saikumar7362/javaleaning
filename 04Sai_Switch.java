package javaleaning;

class Sai_Switch {
    public static void main(String[] args){
        int date = 16;
        switch(date){
            case 13 :
                System.out.println("Tomorrow Onwards Pongal Holidays");
                break;
            case 14 :
                System.out.println("Pongal started ::smile Happy Bhogiii");
                break;
            case 15 :
                System.out.println("Happy Sankranti");
                break;
            case 16 :
                System.out.println("Happy kanumaa");
            default :
                System.out.println("normal days");
                continue;
        }
    }
}
