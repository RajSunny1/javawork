import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the day number:");
		int day = sc.nextInt();
		
		switch (day) {

		case 0:System.out.println("MONDAY");break;
		case 1:System.out.println("TUESDAY");break;
		case 2:System.out.println("WEDNESDAY");break;
		case 3:System.out.println("THURSDAY");break;
		case 4:System.out.println("FRIDAY");break;
		case 5:System.out.println("SATURDAY");break;
		case 6:System.out.println("SUNDAY");break;
		default: System.out.println("WRONG OPTION");
			
			
			
		}

	}

}
