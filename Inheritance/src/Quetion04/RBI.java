package Quetion04;

public class RBI {
	float getInterestRate() {
		return 7;
	}
	
	
}

class SBI extends RBI{
	float getInterestRate() {
		return 7.5f;
	}
	
}
class AXIS extends RBI {
	float getInterestRate() {
		return 8;
	}
	
	
}

class ICICI extends RBI{
	float getInterestRate() {
		return 8.5f;
	}
	
}
