// The Facade Design Pattern decouples or separates the client
// from all of the sub components
// The Facades aim is to simplify interfaces so you don't have
// to worry about what is going on under the hood

package LEKCJA_14_FASADE_DESIGN_PATTERN;
public class BankAccountFacade {
    private int accountNumber ;
    private int securityCode;
    AccountNumberCheck acctChecker;
    SecurityCodeCheck  codeChecker;
    FundsCheck fundChecker;
    WelcomeToBank bankWelcome;
    public BankAccountFacade(int newAccNum,int newSecCode)
    {
        accountNumber = newAccNum;
        securityCode = newSecCode;
        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }
    public int getAccountNumber(){return accountNumber;}
    public int getSecurityCode (){ return securityCode;}
    public void withdrawCahsh(double cashToGet)
    {
        if(acctChecker.accountActive(accountNumber) && codeChecker.isCodeCorrect(securityCode) && fundChecker.haveEnoughMoney(cashToGet))
                {
                    System.err.println("Transaction Complete\n");
                }
                 else
        {
            System.err.println("Transaction Failed\n");
        }
    }
    public void depositCash(double cashToDeposit)
    {
       if(acctChecker.accountActive(accountNumber) && codeChecker.isCodeCorrect(securityCode))
       {
           fundChecker.makeDeposit(cashToDeposit);
           System.err.println("Transaction Complete\n");
       }
       else
        {
            System.err.println("Transaction Failed\n");
        }
    }
}
