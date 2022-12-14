package Inheritancepackage;

class  A  {
	int a, b;
	public void  display() {
		System.out.println("using display methos" + a +"," + b );
	}
}
class B extends A{
	int c;
	public void show() {
		System.out.println("using show  method "+ a+","+b+","+c);
	}
}
public class Main {
	public static void main(String[] args) {
		B obj =new B();
		obj.a =10;
		obj.b =20;
		obj.c=30; 
		obj.display();
		obj.show();
		
		

	}

}
