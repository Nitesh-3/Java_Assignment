import java.io.*;
class pCons
{
    pCons(int id,String name)
    {
        System.out.println("The id is " +id);
        System.out.println("The name is " +name);

    }
}
class ParameterizedConstructor

{
    public static void main(String[] args)
    {
        pCons obj1=new pCons(123,"Nitesh");
        pCons obj2=new pCons(456,"Suraj");
        
    }
}