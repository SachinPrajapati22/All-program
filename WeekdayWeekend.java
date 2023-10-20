import java.util.Scanner;
public class WeekdayWeekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day=sc.next();
        switch(day){
            case "monday": System.out.println("monday is weekday");
                    break;
            case "tuesday": System.out.println("tuesday is weekday");
                          break;
            case "wednesday": System.out.println("wednesday is weekday");
                            break;
            case "thrusday": System.out.println("thrusday is weekday");
                            break;
            case "friday": System.out.println("friday is weekday");
                            break;
            case "saturday": System.out.println("saturday is weekend");
                            break;
            case "sunday": System.out.println("sunday is weekend");
                            break;


        }

    }
}
