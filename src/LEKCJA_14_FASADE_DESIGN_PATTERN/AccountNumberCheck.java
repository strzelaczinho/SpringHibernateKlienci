package LEKCJA_14_FASADE_DESIGN_PATTERN;
public class AccountNumberCheck {
    private int accountNumber = 12345678;
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public boolean accountActive(int acctNumToCheck)
    {
        if (acctNumToCheck == getAccountNumber())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
