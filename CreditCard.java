
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    //declaration of an instance variable
    private int CVCNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    // five parameters for the constructor
    public CreditCard(int cardId, String issuerBank, String bankAccount, int balanceAmount, int CVCNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount, cardId ,bankAccount ,issuerBank);
        this.interestRate = interestRate;
        this.CVCNumber=CVCNumber;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    }
    //accessor for an instance variable
    public int getCVCNumber()
    {
        return this.CVCNumber;
    }
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    public double getInterestRate()
    {
        return this.interestRate;
    }
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    //This accessor method is for setting credit limits.
    public void setCreditLimit(double newCreditLimit, int newGracePeriod)
    {
        if(creditLimit<=2.5+super.getBalanceAmount())
        {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        }
        else
        {
            System.out.println("credit cannot be issued");
        }
    }
    //This accessor method is for cancelling credit card
    public void cancelCreditCard()
    {
        if (isGranted)
        {
            this.CVCNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        }
    }
    //This accessor method is for displaying
    public void display()
    {
        super.display();
        if (isGranted==true)
        {
            System.out.println("CVCNumber:"+CVCNumber);
            System.out.println("InterestRate:"+interestRate);
            System.out.println("CreditLimit:"+creditLimit);
            System.out.println("GracePeriod:"+gracePeriod);
            System.out.println("Expiration Date:" + this.expirationDate);
        }
        else
        {
            System.out.println("your card has been canceled");
        }
    }
}
