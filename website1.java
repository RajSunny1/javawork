import java.util.Scanner;

public class website1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Website;
		System.out.println("Enter the website name");
		Scanner Sc =new Scanner(System.in);
		   Website = Sc.nextLine();
		if(Website.endsWith(".org")) {
			System.out.println("This is an orginastion website");
			
		}
		else if( Website.endsWith(".com")) {
			System.out.println("This is an COMMERICIAL website");}
		else if( Website.endsWith(".in")) {
			System.out.println("This is an indian website");}
		
		}
	}
	





