import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println(" 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division");
        System.out.println("Enter the operation to be performed");
        int choice = sc.nextInt();
        System.out.println("Enter any two nos");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        switch(choice){
            case 1: System.out.println("Addition is " + (a+b));
                    break;
            case 2: System.out.println("Addition is " + (a-b));
                    break;
            case 3: System.out.println("Addition is " + (a*b));
                    break;
            case 4: System.out.println("Addition is " + (a/b));
                    break;
            default: System.out.println("invalid choice");
        }
        sc.close();

    }
}
