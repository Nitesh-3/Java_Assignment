import java.io.*;
import java.util.*;

abstract class A
{
   abstract void show();

}
class B extends A
{
    void show()
    {
        System.out.print("Call me from B.");
    }
    public static void main(String[] args)
    {
        B ob=new B();
        ob.show();
    }
   
}
