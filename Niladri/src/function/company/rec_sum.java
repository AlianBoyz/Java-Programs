package function.company;
import java.util.*;
public class rec_sum
{
    public static int sum(int n)
    {
       if(n<=1)
           return 1;
       return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n= sc.nextInt();
        System.out.println("Sum = "+sum(n));
    }
}
