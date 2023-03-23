//Define a class which has a main method, it initializes two integers, displays their values, swaps them without using a third variable and again displays their values.
import java.util.Scanner;
public class Swap {
public static void main(String[] args)
{
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the Value Of A and B");
    int A = input.nextInt();
    int B = input.nextInt();
    System.out.println("Before Swap A : "+A+" B : "+B);
    A = A+B;
    B = A-B;
    A = A-B;
    System.out.println("After Swap A : "+A+" B : "+B);
}
}
