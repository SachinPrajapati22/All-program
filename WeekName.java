import java.util.*;
public class WeekName {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("1 for monday \n 2 for tuesday \n 3 for wednesday \n 4 for thursday \n 5 for friday \n 6 for saturday \n 7 for sunday");
        System.out.println("Enter the choice");
        int choice = sc.nextInt();

        switch(choice){
            case 1: System.out.println("It is monday");
                    break;
            case 2: System.out.println("It is tuesday");
                    break;
            case 3: System.out.println("It is wednesday");
                    break;
            case 4: System.out.println("It is thursday");
                    break;
            case 5: System.out.println("It is friday");
                    break;
            case 6: System.out.println("It is saturday");
                    break;
            case 7: System.out.println("It is sunday");
                    break;
            default: System.out.println("Wrong choice");
        }
    }

}
