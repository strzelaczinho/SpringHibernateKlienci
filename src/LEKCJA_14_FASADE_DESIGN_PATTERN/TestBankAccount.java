package LEKCJA_14_FASADE_DESIGN_PATTERN;
public class TestBankAccount {
    public static void main(String[]args)
    {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678,1234);
        accessingBank.withdrawCahsh(50.00);
        accessingBank.withdrawCahsh(900.00);
        accessingBank.depositCash(200.00);
        
          accessingBank.withdrawCahsh(900.00);
    }
}
