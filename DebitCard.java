
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    //declaration of an instance variable
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    // six parameters for the constructor
    public DebitCard(int cardId, String bankAccount, int balanceAmount, String issuerBank, String clientName, int pinNumber)
    {
        super(balanceAmount, cardId, bankAccount ,issuerBank);
        setClientName(clientName);
        this.withdrawalAmount=0;
        this.dateOfWithdrawal="";
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
        }
    //accessor for an instance variable
    public int getPinNumber()
    {
        return this.pinNumber;
    }
    public int getWithdrawalAmount()
    {
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal()
    {
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }
    //withDrawalAmount mutator method
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
    //withdraw method
    public void withdraw(int withdrawalAmount,int pinNumber,String dateOfWithdrawal)
    {
            if(this.pinNumber==pinNumber && getBalanceAmount()>=withdrawalAmount)
        {
            setWithdrawalAmount(withdrawalAmount);
            this.dateOfWithdrawal=dateOfWithdrawal;
            this.hasWithdrawn=true;
            setBalanceAmount(getBalanceAmount()-withdrawalAmount);
        }
        else{
            System.out.println("Your current amount is "+getBalanceAmount()+" and sorry we cannot process your transaction");
            }
    }
    //making the display method, which is overridden by the BankCard classdisplay method, non-returning 
    public void display()
    {
        super.display();
        if(this.hasWithdrawn==true)
        {
            System.out.println("Pin number of your debitcard is "+this.pinNumber);
            System.out.println("Amount withdrawn is on "+this.dateOfWithdrawal);
            System.out.println("The withdrawn amount is "+this.withdrawalAmount);
        }
        else{
            System.out.println("Your current balance is "+getBalanceAmount());
        }
    }
}