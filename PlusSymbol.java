public class PlusSymbol {
    public static void main(String args[]) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++) {
                if(k==5 || i==5){
                    System.out.print("*");
                }
            // for(int l=1; l<=n; l++) {
            //     if(i==5) {
            //         System.out.print("*");
            //     }
            // } 
            
            }
            System.out.println(); 
        }
    }
}
