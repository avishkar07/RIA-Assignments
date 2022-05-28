package QuetionNo05;

public class stringbuilder {

	public static void main(String[] args) {
		
	
	StringBuilder builder = new StringBuilder("ABC");
	
	System.out.println(builder.toString());
	
	
	char a =(char)builder.codePointAt(0);
	System.out.println(a);
	
	int b = builder.indexOf("C");
	System.out.println(b);
	
	builder.replace(2, 3,"XYZ");
	System.out.println(builder);
	
	
	builder.reverse();
	System.out.println(builder);
	}
}
