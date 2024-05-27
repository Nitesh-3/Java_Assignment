import java.io.*;
import java.util.*;
class Prime
{
    void prime(int num)
    {
        int i,n,j,count=0;
        n=num;
        if (n<=1)
        {
            System.out.print("Enter a valid number .");
        }
        else
        {
        for(i=2;i<=n;i++)
        {
            count=0;
            for(j=2;j<=i;j++)
            {
            if (i%j==0)
            {
                count+=1; 
            }
            }
            if (count==1)
            {
                System.out.println(i);
            }  
        }
        }
    }    
}

class printPrime
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to print all prime nos upto it :");
        num=sc.nextInt();
        Prime ob=new Prime();
        ob.prime(num);
    }
}