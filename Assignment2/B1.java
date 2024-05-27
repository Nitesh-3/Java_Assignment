import java.io.*;
class A
{
    private int p=10;
    protected int q=20;
    int r=30;
    public int s=40;
    private void P(){};
    protected void Q(){};
    void R(){};
    public void S(){};
}
class B1 extends A
{
    public int s=500;
   /* private void P()
    {
        System.out.println("Value of private p = "+p);
    }*/
    protected void Q()
    {
        System.out.println("Value of protected q = "+q);
    }
    void R()
    {
        System.out.println("Value of default r = "+r);
    }
    public void S()
    {
        System.out.println("Value of public s = "+s);
        System.out.println("Value of class A's public s = "+super.s);
    }
    public static void main(String[] args)
    { 
        B1 obj=new B1();
        A ref;
        //obj.P();
        obj.Q();
        obj.R();
        obj.S();
        ref=obj;
        ref.R();
    }
}