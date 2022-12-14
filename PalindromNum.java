import java.util.Scanner;
public class PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in);
		System.out.println("enter your number");
		int originalNum= Sc.nextInt();
		int newNumber=0;
		int num=originalNum;
		while(num>0){
			newNumber=newNumber*10+num%10;
			num=num/10;
		}
		if(newNumber==originalNum) { 
			System.out.println("Palindrom Number");
		}
		else {
			System.out.println("Not Palindrom Number");
		}

	}

}
