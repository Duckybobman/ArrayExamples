
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = factorial(n);
        System.out.println("Answer is "+answer);
    }
    
    public static int factorial(int n)
    {
        System.out.println(n);
        
        if (n>1)
            return n*factorial(n-1);
        return n;
        
    }
}
