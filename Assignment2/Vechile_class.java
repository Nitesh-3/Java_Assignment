import java.io.*;
abstract class Vehicle{
	abstract void engine();
}
class car extends Vehicle{
	
	public void engine(){
		System.out.println("Car has good engine ");
	}
}
class truck extends Vehicle{
	
	public void engine(){
		System.out.println("Truck has bad engine ");
	}
}
class Vechile_class {
	public static void main (String[] args ){

		Vehicle ref;
		car ob = new car();
		ref = ob;
		ref.engine();
		truck ob1 = new truck();
		ref = ob1;
		ref.engine();
	}
}