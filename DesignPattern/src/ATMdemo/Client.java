package ATMdemo;

public class Client {
	public static void main(String[] args) {
		AtmMachine atmMachine=new AtmMachine();
		
		atmMachine.enterPinAndWithdrawMoney();
		atmMachine.ejectDebitCard();
		atmMachine.insertDebitCard();
		System.out.println();
		
		System.out.println("\n*******************************************************");
		  
		/*Debit card is inserted so internal state of ATM changed to Has Debit card*/
		
		System.out.println("ATM machine current state"+atmMachine.getAtmMachineState().
				getClass().getName());
		System.out.println();
		atmMachine.enterPinAndWithdrawMoney();
		atmMachine.insertDebitCard();
		atmMachine.ejectDebitCard();
		
		/*Debit card is ejected so internal state of ATM changed to No Debit card state*/
		 /*
	     * Debit Card has been ejected so internal state of ATM Machine
	     * has been changed to 'noDebitCardState'
	     */

	    System.out.println("\nATM Machine Current state : "
	                    + atmMachine.getAtmMachineState().getClass().getName());

	}

}
