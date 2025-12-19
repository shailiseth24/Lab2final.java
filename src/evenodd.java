import java.util.*;
class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int even = 0, odd = 0,i;
        for(i=1;i<=10;i++) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
        if (n % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of Even numbers = " + even);
        System.out.println("Number of Odd numbers  = " + odd);
    }
}
