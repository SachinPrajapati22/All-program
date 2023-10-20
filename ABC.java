public class ABC {
    public static void main(String args[]) {
        
        
        for(int i=1; i<=4;i++){
            char ch = 'a';
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            // for(int k=1; k<=4;k++){
            //     System.out.print(ch);
            //     ch++;
            // }
        }
        for(int i=2; i<=4;i++) {
            char ch = 'a';
            for(int j=i; j<=4;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
