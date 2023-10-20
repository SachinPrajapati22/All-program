import java.util.Scanner;

public class season {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter month name: ");
    String month = sc.next();
    switch (month) {
      case "january":
        System.out.println("it's a winter");
        break;
      case "february":
        System.out.println("it's a winter");
        break;
      case "march":
        System.out.println("it's a spring");
        break;
      case "april":
        System.out.println("it's a spring");
        break;
      case "may":
        System.out.println("it's a spring");
        break;
      case "june":
        System.out.println("it's a summer");
        break;
      case "july":
        System.out.println("it's a summer");
        break;
      case "august":
        System.out.println("it's a summer");
        break;
      case "september":
        System.out.println("it's a fall");
        break;
      case "october":
        System.out.println("it's a fall");
        break;
      case "november":
        System.out.println("it's a fall");
        break;
      case "december":
        System.out.println("it's a winter");
        break;
    }
   sc.close(); 
  }
}
