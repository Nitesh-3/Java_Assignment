import java.io.*;
import java.util.*;
class swap
{
    void swap(int x,int y)
    {
        int a,b,temp;
        a=x;
        b=y;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping :");
        System.out.println("The value of first number = " +a);
        System.out.println("The value of second number = " +b);

    }
    

}

class swapUsingReference
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number to swap :");
        x=sc.nextInt();
        System.out.print("Enter Second number to swap :");
        y=sc.nextInt();
        swap Ref;
        swap ob1=new swap();
        Ref = ob1;
        ob1.swap(x,y);

    }
}