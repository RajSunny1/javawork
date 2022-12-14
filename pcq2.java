import java.util.Scanner;
public class pcq2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Byte m1,m2,m3 ;
		Scanner Sc=new Scanner (System.in);
		System.out.println("enter your marks of math");
		m1 = Sc .nextByte();
		System.out.println("enter your marks of physics");
		m2 =Sc. nextByte();
		System.out.println("enter your marks of chemsirty");
		m3 =Sc.nextByte();
		float avg =(m1+m2+m3)/3.0f;
		System.out.println(" your overall percentage " +avg);
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("congratulation you have been promoted");
		}
		else {
			System.out.println("sorry ,you have not been promoted !please try again ");
		}
		

	}

}
