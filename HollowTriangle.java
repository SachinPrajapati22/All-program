public class HollowTriangle {
    public static void main(String args[]) {
        int n = 5; //Enter the no of rows

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j==1 || i==n || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    //     for(int i=1; i<n; i++) {
    //         for(int j=1; j<=n; j++) {
    //             if(j==1 || i==1 || i>j){
    //                 System.out.print("*");
    //             }
    //             else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //    }
    }
    
}
