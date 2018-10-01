package LEKCJA_14_FASADE_DESIGN_PATTERN;
public class FundsCheck {
    private double cashInAccount = 1000.00;
    
    public double getCashInAccount()
    {
        return  cashInAccount;
    }
    public void decreaseCashInAccount(double cashWithdrawn)
    {
        cashInAccount -= cashWithdrawn;
    }
    public void increaseCashInAccount(double cashDeposited)
    {
        cashInAccount += cashDeposited;
    }
    public boolean haveEnoughMoney(double cashToWithdrawal)
    {
        if (cashToWithdrawal > getCashInAccount())
        {
            System.err.println("Error: You don't have enough money");
            System.err.println("Current Balance: "+getCashInAccount());
             return false;
        }
        else
        {
            decreaseCashInAccount(cashToWithdrawal);
            System.err.println("Withdraw complete: Your current balance is "+getCashInAccount());
            return true;
        }
       
    }
    public void makeDeposit(double cashToDeposit)
    {
        increaseCashInAccount(cashToDeposit);
        System.err.println("Deposit complete: Current balance is "+getCashInAccount());
    }
}
