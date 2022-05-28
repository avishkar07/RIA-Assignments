package QuetionNo04;


public class stringbuffer {
	
	public static void main(String[] args) {
		
		
		StringBuffer buffer = new StringBuffer("ABC");
		
		System.out.println("Capacity :"+buffer.capacity());

		buffer.reverse();
		System.out.println(buffer);
		
		buffer.deleteCharAt(1);
		System.out.println(buffer);

		char a = buffer.charAt(1);
		System.out.println(a);
		
		System.out.println(buffer.length());
		buffer.replace(0,2, "XYZ");
		System.out.println(buffer);
	}
}
