//Define a class which has a main method, it receives an integer as input and displays whether it is palindrome or not?
import java.util.*;
public class Ispalindrome {
    String method1(String str, int size, String ans) {
        if (size == 0) return ans;
        return method1(str, size - 1, ans + str.charAt(size - 1));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for find out whether it a palindrome or not");
        int num = input.nextInt();
        String str = String.valueOf(num);
        Ispalindrome obj = new Ispalindrome();
        String str2 = obj.method1(str,str.length(),"");
        if(str.equals(str2))
        {
            System.out.println(num + " is a palindrome number");
        }
        else
        {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
