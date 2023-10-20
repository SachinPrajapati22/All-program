import java.util.Scanner;

public class traffic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Press 1 for RED");
    System.out.println("Press 2 for YELLOW");
    System.out.println("Press 3 for GREEN");
    System.out.print("Enter: ");
    int ch = sc.nextInt();
    switch (ch) {
      case 1:
        System.out.println("STOP");
        break;
      case 2:
        System.out.println("READY");
        break;
      case 3:
        System.out.println("GO");
        break;
    }
    sc.close();
  }
}
