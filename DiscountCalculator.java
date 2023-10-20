
 import java.util.*;
 public class DiscountCalculator {
        public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the total bill");
        float Bill = sc.nextFloat();
        float Discount;

        if (Bill >= 5000 && Bill <= 1000){
            if (Bill >= 10000){
                if (Bill <= 20000){
                    Discount = Bill * .15f;
                }
                else{
                    Discount = Bill * .25f;
                }
            }
            else{
                Discount = Bill * .10f;
            }
        }
        else{
            Discount = Bill * .05f;
        }
        System.out.println("Total discount is " + Discount);
        System.out.println("Payable amount is " + (Bill-Discount));
        sc.close();
    }
}
