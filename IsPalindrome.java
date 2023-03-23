//Define a class which has a main method, it receives an integer as input and displays whether it is palindrome or not?
import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int sum = 0, temp = num;
        while (temp!=0) {
            int rem = temp % 10;
            temp /= 10;
            sum = (sum * 10) + rem;
        }
        if (sum == num) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }

    }
}
