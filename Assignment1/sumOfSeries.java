import java.io.*;
import java.util.*;
class Sum
{
    void sum(int n)
    {
        int fact=1;double x,s=0;
        int i,j;
        for(i=1;i<=n;i++)
        {      
            fact=1;
            for(j=1;j<=i;j++)
            
                {
                fact=fact*j;
                }
                x=1.0/fact;
                s=s+x;
        }
        System.out.print("The sum = " +s);  
    }
    
}

class sumOfSeries
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n=sc.nextInt();
        Sum ob=new Sum();
        ob.sum(n);
    }
}