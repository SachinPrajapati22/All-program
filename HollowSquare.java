public class HollowSquare {
    public static void main(String args[]){
        int n = 4; //Enter the no of lines

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n;j++){
                if(j==1 || j==n || i==1 ||i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
