 import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the marks of sanskrit");
		int a =sc.nextInt();
		System.out.println("enter the marks of math");
		int b =sc.nextInt();
		System.out.println("enter the marks of science");
		int c =sc. nextInt();
		System .out.println("enter the marks of hindi");
		int d =sc.nextInt();
		System .out.println("enter the  marks of s.social");
		int e =sc.nextInt();
		System.out.println("sum of five subject");
		int Sum = a + b+ c +d + e;
         System.out.println(Sum);
         System.out.println("the percentage of all subject %");
         float percentage = Sum/5;
         System.out.println(percentage);

	}

}
