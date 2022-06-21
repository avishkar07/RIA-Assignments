
import java.lang.Math;
public class RandamPassword {
	static String password ;
	public RandamPassword(String password) {
		super();
		this.password = password;
	}

	public static void main(String[] args) {
		
		RandamPassword randam = new RandamPassword(password);
		int length;
//		randam.randamPassword(length);
	
	}

	private String randamPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);

		}
		return new String(password);
	}
}
