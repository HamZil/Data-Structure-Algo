package code;

public class ATMMachine implements GetATMData{

		ATMState hasCard;
		ATMState noCard;
		ATMState hasCorrectPin;
		ATMState atmOutOfMoney;
		ATMState atmState; 
		int CashInMachine = 2000;
		boolean correctPinEntered = false;
		
		public ATMMachine () {
			
			hasCard = (ATMState) new HasCard(this);
			noCard = new NoCard(this);
			hasCorrectPin = new HasPin(this);
			atmOutOfMoney = new NoCash(this);
			atmState = noCard;
			if (CashInMachine < 0) {
				atmState = atmOutOfMoney;
			}
		
		}
		
		void setATMState(ATMState newATMState){
		        atmState = newATMState;}
		
		public void setCashInMachine(int newCashInMachine){
		        CashInMachine = newCashInMachine;
		        
		}
		
		public void insertCard() {
		        atmState.insertCard();
		        
		}
		
		public void ejectCard() {
		        atmState.ejectCard();
		        
		}
		public void requestCash(int cashToWithdraw) {
		    atmState.requestCash(cashToWithdraw);}
		
		public void insertPin(int pinEntered){
		    atmState.insertPin(pinEntered);
		    
		}
		
		
		public ATMState getYesCardState() 	{ return hasCard; }
		public ATMState getNoCardState() 	{ return noCard; }
		public ATMState getHasPin() 		{ return hasCorrectPin; }
		public ATMState getNoCashState() 	{ return atmOutOfMoney; }
		public ATMState getATMState() 		{ return atmState; }
		public int getCashInMachine() 		{ return CashInMachine; }
		
}
