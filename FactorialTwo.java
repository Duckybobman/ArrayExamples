
/**
 * Write a description of class FactorialTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FactorialTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Input an integer");
        int n = sc.nextInt();
        int answer = factorial(n);
        System.out.println("The answer is "+answer);
    }
    
    public static int factorial(int n)
    {
        if (n<=1)
            return n;
        else 
            return n*factorial(n-1);
    }
}
