import java.io.*;
abstract class Vehicle
{
    abstract void engine();
}
class car extends Vehicle
{
    void engine()
    {
        System.out.println("Car has a good engine .");
    }
}
class truck extends Vehicle
{
    void engine()
    {
        System.out.println("Truck has a bad engine .");
    }
}
class AbstractClassVehicle
{
    public static void main(String[] args)
    {
        car obj1=new car();
        obj1.engine();
        truck obj2=new truck();
        obj2.engine();
    }
}