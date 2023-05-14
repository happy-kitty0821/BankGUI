
/**
 * Write a description of class BankClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    //Attribute declaration for the BankCard class
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    //constructor for the BankCard class
    public BankCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName)
    {
        this.cardId=cardId;
        this.issuerBank=issuerBank;
        this.bankAccount=bankAccount;
        this.balanceAmount=balanceAmount;
        this.clientName="";
    }
    //accessor method for each attributes
    public int getCardId()
    {
        return this.cardId;
    }
    public String getClientName()
    {
        return this.clientName;
    }
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }
    //setting CilentName's using the setter method
    public void setClientName(String clientName)
    {
        this.clientName= clientName;
    }
    // Display method to show the Attributes value
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    public void display()
    {
        //checks to see if the client name is empty.
        if(clientName=="")
        {
            System.out.println("Please check your account name");
        }
        else{
            System.out.println("CardId: "+cardId);
            System.out.println("ClientName :"+clientName);
            System.out.println("IssuerBank : "+issuerBank);
            System.out.println("BankAccount : "+bankAccount);
            System.out.println("BalanceAmount : "+balanceAmount);
        }
    }
}