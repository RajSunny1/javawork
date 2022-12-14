package Inheritancepackage;
class Bikeprot {
	protected int speedlimit =75;
	
}


public class Honda3prot extends Bikeprot {
	int speedlimit =150;
	

	public static void main(String[] args) {
		Bikeprot obj =new Honda3prot ();
		System.out.println(obj.speedlimit);
		

	}

}
