import java.util.*;
public class Vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(1);

        if (ch == 'A' && ch == 'a'){
            System.out.println(ch + " is a vowel");
        }
        else if(ch == 'E' && ch == 'e'){
            System.out.println(ch + " is a vowel");
        }
        else if(ch == 'I' && ch == 'i'){
            System.out.println(ch + " is a vowel");
        }
        else if (ch == 'O' && ch == 'o'){
            System.out.println(ch + " is a vowel");
        }
        else if(ch == 'U' && ch == 'u'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
    }
}
