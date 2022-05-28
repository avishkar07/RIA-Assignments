package Quetion05;

public class Payment {

	void paymentfunction(String Address) {
		System.out.println("Address :"+Address);
		System.out.println("----Order Successfully----");
	}

	void paymentfunction(long UserID ,String Password) {
		System.out.println("UserID :"+UserID );
		System.out.println("Password :"+Password);
		System.out.println("----Order Successfully----");
	}
	void paymentfunction(String Name , Long CardNo ,int CVV ,int Date) {
		System.out.println("Name :"+Name);
		System.out.println("Card No :"+ CardNo);
		System.out.println("CVV :"+CVV);
		System.out.println("Date :"+Date);
		System.out.println("----Order Successfully----");
		
	}
}