import java.util.*;
public class Tempconverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the scale to be converted");
        String choice = sc.nextLine();
        System.out.println("Enter the temperature");
        float Temp = sc.nextFloat();
        float F ,C;

        switch(choice){
             case "celcius": {
                C = ((Temp-32)/9)*5;
                System.out.println("Result is" + C);
             }
             case "fahrenheit": {
                F =((9*Temp)/5)-32;
                System.out.println("Result is " + F);
             }
        }
    }
}
