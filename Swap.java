//Define a class which has a main method, it initializes two integers, displays their values, swaps them without using a third variable and again displays their values.
import java.util.Scanner;

public class Swap {
    void swap(int A, int B)
    {
        System.out.println("Before Swap");
        System.out.println("A is "+ A +" and B is "+B);
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("After Swap");
        System.out.println("A is "+ A +" and B is "+B);
    }
public static void main(String[] args)
{
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the Value Of A and B");
    int A = input.nextInt();
    int B = input.nextInt();

    Swap obj = new Swap();
    obj.swap(A,B);
    System.out.println("A is "+ A +" and B is "+B);


}
}
