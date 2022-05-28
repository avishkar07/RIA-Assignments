package Quetion01;

public class MainClass extends UserRegistration {
/**
 * @param args
 */
public static void main(String[] args) {
	UserRegistration userRegistration = new  UserRegistration();
	userRegistration.getinfo();
	
try {
	userRegistration.findage(age);
} catch (InvalidAgeException e1) {
	e1.printStackTrace();
}


try {
	userRegistration.findcountry(country);
} catch (InvalidCountryException e) {
	e.printStackTrace();
}
}
}
