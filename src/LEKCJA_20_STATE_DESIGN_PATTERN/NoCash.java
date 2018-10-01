package LEKCJA_20_STATE_DESIGN_PATTERN;
public class NoCash implements ATMState{
ATMMachine atmMachine;
public NoCash(ATMMachine newAtmMachine)
{
    atmMachine = newAtmMachine;
}
    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
       System.out.println("We don't have money. You didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have money");
    }
    
}
