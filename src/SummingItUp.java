
import java.util.Scanner;

public class SummingItUp
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(fib(a));
    }

    public static int sum(int a)
    {
        int b = 0;

        if(a>1)
        {
            b = a + sum(a - 1);
        }
        else if(a == 1)
        {
            return 1;
        }

        return b;

    }

    public static int fib(int a)
    {
        int b = 0;

        if(a == 2 || a == 1)
        {
            return 1;
        }
        else
        {
            b = fib(a - 2) + fib(a - 1);
        }

        return b;
    }



}
