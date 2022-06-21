package ATMdemo;

public class AtmMachine implements AtmMachineState{
	private AtmMachineState atmMachineState;
	
	public AtmMachine()
	{
		atmMachineState = new NoDebitcardState();
	}

	public AtmMachineState getAtmMachineState() {
		return atmMachineState;
	}

	public void setAtmMachineState(AtmMachineState atmMachineState) {
		this.atmMachineState = atmMachineState;
	}

	@Override
	public void insertDebitCard() {
		// TODO Auto-generated method stub
		atmMachineState.insertDebitCard();
		if(atmMachineState instanceof NoDebitcardState)
		{
			AtmMachineState noDebitcardState=new NoDebitcardState();
			setAtmMachineState(noDebitcardState);
			System.out.println("Atm internal state is moved to"+atmMachineState.getClass().getName());
		}
	}

	@Override
	public void ejectDebitCard() {
		// TODO Auto-generated method stub
		if(atmMachineState instanceof HasDebitCardState)
		{
			AtmMachineState noDebitcardState=new NoDebitcardState();
			setAtmMachineState(noDebitcardState);
			System.out.println("Atm internal state is moved to"+atmMachineState.getClass().getName());
		}
	}

	@Override
	public void enterPinAndWithdrawMoney() {
		// TODO Auto-generated method stub
		atmMachineState.enterPinAndWithdrawMoney();
	}
	

}
