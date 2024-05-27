import java.io.*;
import java.util.*;
class TwoSumDemo
{
    int n,i,target,complement;int[] arr;
    int[] TwoSum()
    {
    System.out.println("Enter the size of Array");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    arr=new int[n];
    for(i=0;i<n;i++)
    {
        System.out.println("Enter element :");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the target :");
    target=sc.nextInt();
    for(i=0;i<n;i++)
    {
    complement=target-arr[i];
    for (int j=i+1;j<n;j++)
    {
        if(arr[j]==complement)
        {
           return new int[]{i,j};
        }
    }
    }
    return new int[]{-1,-1};}
    
}
class TwoSum
{
    public static void main(String[] args)
    {
        TwoSumDemo obj=new TwoSumDemo();
        int[] result=obj.TwoSum();
        System.out.println(Arrays.toString(result));
    }
}