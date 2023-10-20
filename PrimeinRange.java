import java.util.*;
public class PrimeinRange {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no to be checked as prime");
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        
        
            for(int i=start; i<=end; i++){
                if(i == 2){
                    System.out.println(i);
                }
                else{
                    for(int j=2; j<=end-1; j++){
                        if(i%j == 0){
                            System.out.println();
                        }
                        else{
                            
                        }
               
                    }
                }
            }
        
    }
}