package javaleaning;
 class Sai_IfConditions {
    public static void main(String[] args){
        String day = "sunday";
        if (day.equals("sunday")) {
            System.out.println("31 December last day of the year");
        }else if (day.equals("monday")) {
            System.out.println("happy new year");
        }else {
            System.out.println("none of these");
        }
    }
}
