public class Rhombus {
    public static void main(String args[]) { 
        //Enter the no of lines
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=i-1; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
       }
       for(int i=1; i<=n; i++) {
            for(int k=n; k>i; k--) {
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
       }
    }
}
