
public class practiceset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="SUNNY RAJ";
				name = name.toLowerCase();
				System.out.println(name);
				//PROBLEM2
				String text ="This is java program";
				text = text.replace(" ", "_");
				System.out.println(text);
				//problem3
				String letter =" Dear <|name|> Thanks a lots !";
		     letter =   letter.replace("<|name|>", "sunny");
				System.out.println(letter);
				//problem4
				String mystring =" this is double  and triple string";
				System.out.println(mystring.indexOf("  "));
				System.out.println(mystring.indexOf("   "));
				//problem5
				String letter2="dear sunny \n\t thanks for \n java code";
				System.out.println(letter2);

	}

}
