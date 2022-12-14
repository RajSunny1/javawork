import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("enter yours age");
		Scanner sc=new Scanner(System.in);
		 age = sc.nextInt();
		 switch (age) {
		 case 18:
			 System.out.println("you are adult");
				 break;
		 case 23:
			 System.out.println("you are ready for job");
			 break;
		 case 60:
			 System .out.println("you can retired");
				 break;
			 default:
				 System.out.println("enjoy you life!");
		 
		/*if(age>56) {
			System.out.println("you are experenices");
		}
		 else if(age>46) {
			System.out.println("you are semi -experenices");
		}
		else if(age>36) {
			System.out.println("you are semi -semi-experenices");
		}
		else {
			System.out.println("you are fresher");*/
		}
		
		}
		
	}


