import java.util.Scanner;

public class ues1 {
    public static void main(String[] args) {
        System.out.println("Enter n size");
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr;
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
}
