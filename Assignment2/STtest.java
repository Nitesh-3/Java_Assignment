import java.io.*;
import java.util.*;
class Student2
{
       String name;
       int roll;
       String address;
       long mob;
    void getData(String n,int r,String a,long m)
    {
       name=n;
       roll=r;
       address=a;
       mob=m;
    }
    void printData()
    {
        System.out.println("Student's name is " + name);
        System.out.println("Student's roll is " + roll);
        System.out.println("Student's address is " + address);
        System.out.println("Student's mobile number is " + mob);

    }
}
class STtest
{
    public static void main(String[] args)
    
    {
        Student2 s1=new Student2();
        s1.getData("Nitesh",22,"Siliguri",8888899999L);
        s1.printData();
        Student2 s2=new Student2();
        s2.getData("Siddhant",31,"Banarhat",99999888888L);
        s2.printData();
        
    }
}