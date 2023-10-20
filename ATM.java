import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("         Welcome to the ATM machine       ");
        System.out.println("------------------------------------------");
        int balance = 1000;
        System.out.print("Enter your id: ");
        String id=sc.next();
    
        if(id.equals("sunny")){
            System.out.println("User id is valid");
            System.out.print("Enter your password: ");
            int password=sc.nextInt();

            if(password==123){
                System.out.println("Your password is valid");
                System.out.print("Enter 1 for balance enquiry");
                System.out.print("\nEnter 2 for deposite");
                System.out.print("\nEnter 3 for withdrawl");
                System.out.print("\nEnter: ");
                int ch=sc.nextInt();
                
             switch(ch){
                           case 1: System.out.println(balance);
                                   break;
                           case 2: System.out.print("Enter the amount: ");
                                   int deposite=sc.nextInt();
                                   System.out.println(balance=(balance+deposite));
                                   break;
                           case 3: System.out.print("Enter the amount: ");
                                   int withdrawl=sc.nextInt();
                                   System.out.println(balance=(balance-withdrawl));
                                   break;
                         default : System.out.println("invalid input");
             }
            }

            else{
                System.out.println("you have enter the wrong password");
            }



        }
        else{
            System.out.println("you have enter the wrong id");
        }
      sc.close();  

    }
}
