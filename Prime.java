import java.util.*;
class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        int number = sc.nextInt();
        boolean IsPrime = true;
        
        if(number == 2){
            System.out.println("It is a prime no");
        }
        else{
            for(int i=2; i<=Math.sqrt(number); i++){
            if(number % i == 0){
                IsPrime = false;
            }
        }
            if(IsPrime == true){
                System.out.println("It is a prime no");
        }
            else{
                System.out.println("It is not a prime no");
        }  
        }
        

    }
}
