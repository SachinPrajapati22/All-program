import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the income");
        float Income = sc.nextInt();
        float Tax;

        if (Income >= 10000){
            if (Income >= 20000){
                if (Income > 30000){
                    Tax = Income * 0.15f ;
                }
                else{
                     Tax = Income * 0.25f;
                }
            }
            else{
                Tax = Income * 0.10f;
            }
        }
        else{
            Tax = 0.0f;
        }
        System.out.println("Tax is " + Tax);
    }
}       

