import java.util.*;
class positive {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float number = sc.nextFloat();
        if (number > 0 ){
            System.out.println("positive number");
        }
        else if (number == 0){
            System.out.println("number is zero");

        }
        else{
            System.out.println("negative number");
        }
    }
    
}
