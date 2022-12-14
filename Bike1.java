package Inheritancepackage;
abstract class bike{
	abstract void run();
	}
public class Bike1 extends bike{
	void run() {
		System.out.println("running safely....");}
		public static void main (String[]args ) {
			bike obj =new Bike1();
			obj.run();
		}
	}

 


