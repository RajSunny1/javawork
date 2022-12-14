package Inheritancepackage;
class Add {
	static int  performAddition(int a ,int b) { return a+b;}
	static float performAddition(float a ,float b) {return a+b;}
}

public class Main1 {

	public static void main(String[] args) {
		Add a = new Add ();
		System.out.println(a.performAddition(8,1));
		System.out.println(a.performAddition(4, 9));

	}

}
