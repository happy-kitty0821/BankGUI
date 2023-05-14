import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class BankGUI 
{
    private JFrame frame1, frame2, frame3; 
        private JLabel cardId,clientName,issuerBank,bankAccount,balanceAmount, pinNumber, withdrawalAmount, withdrawalDate, CVCNumber, creditLimit, InterestRate, graceperiod, expirationDate, withdrawcardId, withdrawpinNumber, creditcardId, creditClientName,creditIssuerBank, creditBankAccount, creditBalanceAmount;
        private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7, textField8, textField9, textField10, textField11, textField12, textField13, textField14, textField15, textField16, textField17, textField18;
        private JButton adddebit, DisplayD, creditcard, clear,withdrawcard, withdraw, withdarwclear,withdrawback, back, addcredit, creditclear, addcreditLimit, cancelcredit, Displayc;
        private JComboBox<String> years, months, days, years2, months2, days2;
        private String[] year= {"year","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030","2031","2032","2033"};
        private String[] month= {"month","jan", "feb", "mar", "apr", "may", "jun", "jul", "sep", "oct", "nov", "dec"};
        private String[] day= {"day","01","02", "03" ,"04","05" ,"06" ,"07" ,"08" ,"09","10" ,"10" ,"11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       
        final static int INVALID = -1;
        ArrayList<BankCard> array = new ArrayList<BankCard>();
    public BankGUI()
    {
        frame1 = new JFrame("BankGUI");
        frame1.setSize(450, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);

        cardId = new JLabel("Card ID");
        cardId.setBounds(15, 15, 100, 30);
        frame1.add(cardId);
        textField1 = new JTextField();
        textField1.setBounds(140, 15, 150, 30);
        frame1.add(textField1);

        clientName = new JLabel("Client Name");
        clientName.setBounds(15, 50, 100, 30);
        frame1.add(clientName);
        textField2 = new JTextField();
        textField2.setBounds(140, 50, 150, 30);
        frame1.add(textField2);

        issuerBank = new JLabel("Issuer Bank");
        issuerBank.setBounds(15, 85, 100, 30);
        frame1.add(issuerBank);
        textField3 = new JTextField();
        textField3.setBounds(140, 85, 150, 30);
        frame1.add(textField3);

        bankAccount = new JLabel("Bank Account");
        bankAccount.setBounds(15, 120, 100, 30);
        frame1.add(bankAccount);
        textField4 = new JTextField();
        textField4.setBounds(140, 120, 150, 30);
        frame1.add(textField4);

        balanceAmount = new JLabel("Balance Amount");
        balanceAmount.setBounds(15, 155, 100, 30);
        frame1.add(balanceAmount);
        textField5 = new JTextField();
        textField5.setBounds(140, 155, 150, 30);
        frame1.add(textField5);

        pinNumber = new JLabel("Pin Number");
        pinNumber.setBounds(15, 190, 100, 30);
        frame1.add(pinNumber);
        textField6 = new JTextField();
        textField6.setBounds(140, 190, 150, 30);
        frame1.add(textField6);

        adddebit = new JButton("Add Debit Card");
        adddebit.setBounds(15, 235, 140, 30);
        frame1.add(adddebit);

        //event handeling

        adddebit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addDebit();
            }
        });
        

        DisplayD = new JButton("Display");
        DisplayD.setBounds(165, 235, 100, 30);
        frame1.add(DisplayD);

        //event handeling

        DisplayD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                showDebit();
            }
        });

        withdrawcard = new JButton("Withdraw Card");
        withdrawcard.setBounds( 275, 235, 140, 30);
        frame1.add(withdrawcard);

        //event handeling

        withdrawcard.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                frame2.setVisible(true);
                frame1.dispose();
            }
        });

        creditcard = new JButton("Credit Card");
        creditcard.setBounds( 100, 270, 100, 30);
        frame1.add(creditcard);

        //event handeling

        creditcard.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                frame3.setVisible(true);
                frame1.dispose();

            }
        });

        clear = new JButton("Clear");
        clear.setBounds( 225, 270, 100, 30);
        frame1.add(clear);

        //event handeling
        
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
            }
        });


        frame1.setVisible(true);


        frame2 = new JFrame();
        frame2.setSize(450, 500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        
        withdrawcardId = new JLabel("CardId");
        withdrawcardId.setBounds(15, 15, 100, 30);
        frame2.add(withdrawcardId);
        textField7 = new JTextField();
        textField7.setBounds(140, 15, 150, 30);
        frame2.add(textField7);

        withdrawpinNumber = new JLabel("Pin Number");
        withdrawpinNumber.setBounds(15, 55, 100, 30);
        frame2.add(withdrawpinNumber);
        textField8 = new JTextField();
        textField8.setBounds(140, 55, 150, 30);
        frame2.add(textField8);

        withdrawalAmount = new JLabel("Withdrawal Amount");
        withdrawalAmount.setBounds(15, 95, 100, 30);
        frame2.add(withdrawalAmount);
        textField9 = new JTextField();
        textField9.setBounds(140, 95, 150, 30);
        frame2.add(textField9);

        withdrawalDate = new JLabel("Withdrawal Date");
        withdrawalDate.setBounds(15, 135, 100, 30);
        frame2.add(withdrawalDate);
        years = new JComboBox<String>(year);
        years.setBounds(140, 135, 60, 30);
        frame2.add(years);
        months = new JComboBox<String>(month);
        months.setBounds(210, 135, 60, 30);
        frame2.add(months);
        days = new JComboBox<String>(day);
        days.setBounds(280, 135, 60, 30);
        frame2.add(days);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds( 50, 175, 100, 30);
        frame2.add(withdraw);

        withdraw.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                Withdraw();
            }
        });

        withdarwclear = new JButton("clear");
        withdarwclear.setBounds( 160, 175, 100, 30);
        frame2.add(withdarwclear);
        
        withdarwclear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                years.setSelectedIndex(0);
                months.setSelectedIndex(0);
                days.setSelectedIndex(0);
            }
        });

        withdrawback = new JButton("Back");
        withdrawback.setBounds( 270, 175, 100, 30);
        frame2.add(withdrawback);

        withdrawback.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                frame1.setVisible(true);
                frame2.dispose();
            }
        });
        
        frame3 = new JFrame();
        frame3.setSize(500, 600);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setLayout(null);
        frame3.setResizable(false);
        frame3.setLocationRelativeTo(null);

        

        creditcardId = new JLabel("CardId");
        creditcardId.setBounds(15, 15, 100, 30);
        frame3.add(creditcardId);
        textField12 = new JTextField();
        textField12.setBounds(140, 15, 150, 30);
        frame3.add(textField12);

        creditClientName = new JLabel("Client Name");
        creditClientName.setBounds(15, 55, 100, 30);
        frame3.add(creditClientName);
        textField15 = new JTextField();
        textField15.setBounds(140, 55, 150, 30);
        frame3.add(textField15);

        InterestRate = new JLabel("Interest Rate");
        InterestRate.setBounds(15, 95, 100, 30);
        frame3.add(InterestRate);
        
        textField13 = new JTextField();
        textField13.setBounds(140, 95, 150, 30);
        frame3.add(textField13);
        

        creditIssuerBank= new JLabel("Issuer Bank");
        creditIssuerBank.setBounds(15, 135, 100, 30);
        frame3.add(creditIssuerBank);
        textField16 = new JTextField();
        textField16.setBounds(140, 135, 150, 30);
        frame3.add(textField16);

        creditBankAccount = new JLabel("Bank Account");
        creditBankAccount.setBounds(15, 175, 100, 30);
        frame3.add(creditBankAccount);
        textField17 = new JTextField();
        textField17.setBounds(140, 175, 150, 30);
        frame3.add(textField17);

        creditBalanceAmount = new JLabel("Balance Amount");
        creditBalanceAmount.setBounds(15, 215, 100, 30);
        frame3.add(creditBalanceAmount);
        textField18 = new JTextField();
        textField18.setBounds(140, 215, 150, 30);
        frame3.add(textField18);

        expirationDate = new JLabel("Expiration Date");
        expirationDate.setBounds(15, 255, 100, 30);
        frame3.add(expirationDate);
        years2 = new JComboBox<String>(year);
        years2.setBounds(140, 255, 90, 30);
        frame3.add(years2);
        months2 = new JComboBox<String>(month);
        months2.setBounds(240, 255, 90, 30);
        frame3.add(months2);
        days2 = new JComboBox<String>(day);
        days2.setBounds(340, 255, 90, 30);
        frame3.add(days2);

        CVCNumber = new JLabel("CVC Number");
        CVCNumber.setBounds(15, 295, 100, 30);
        frame3.add(CVCNumber);
        textField10 = new JTextField();
        textField10.setBounds(140, 295, 150, 30);
        frame3.add(textField10);

        creditLimit = new JLabel("Credit Limit");
        creditLimit.setBounds(15, 335, 100, 30);
        frame3.add(creditLimit);
        textField11 = new JTextField();
        textField11.setBounds(140, 335, 150, 30);
        frame3.add(textField11);

        graceperiod = new JLabel("Grace Period");
        graceperiod.setBounds(15, 375, 100, 30);
        frame3.add(graceperiod);
        textField14 = new JTextField();
        textField14.setBounds(140, 375, 150, 30);
        frame3.add(textField14);


        addcredit = new JButton("Add credit card");
        addcredit.setBounds( 30, 415, 150, 30);
        frame3.add(addcredit);

        addcredit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                addCreditcard(); 
            }
        });
        

        back = new JButton("Back");
        back.setBounds( 190, 415, 100, 30);
        frame3.add(back);

        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                frame1.setVisible(true);
                frame3.dispose();
            }
        });

        creditclear = new JButton("clear");
        creditclear.setBounds( 300, 415, 100, 30);
        frame3.add(creditclear);

        creditclear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                textField10.setText("");
                textField11.setText("");
                textField12.setText("");
                textField13.setText("");
                textField14.setText("");
                years2.setSelectedIndex(0);
                months2.setSelectedIndex(0);
                days2.setSelectedIndex(0);
            }
        });

        Displayc = new JButton("Display");
        Displayc.setBounds(10, 455, 150, 30);
        frame3.add(Displayc);

        Displayc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe)
            {
                displayCredit();
            }
        });

        addcreditLimit = new JButton("Add Credit Limit");
        addcreditLimit.setBounds( 170, 455, 150, 30);
        frame3.add(addcreditLimit);

        addcreditLimit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent oe){
                creditLimit();
            }
        });
        

        cancelcredit = new JButton("Cancel credit Card");
        cancelcredit.setBounds( 330, 455, 150, 30);
        frame3.add(cancelcredit);

        cancelcredit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                cancelCreditCard();
            }
        });
        
        





        
        
    }
    //debit
    public int getCardID() 
    {
        int CardId = INVALID;
        try {
            CardId = Integer.parseInt(textField1.getText().trim());
            if (CardId <= 0) 
            {
                CardId = INVALID;
            }
        } catch (Exception ae) 
        {
            JOptionPane.showMessageDialog(frame1, "INVALID ERROR" + "\n" + "Please enter cardId in Number form",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return CardId;
    }

    public String getClientName() 
    {
        String Name = clientName.getText();
        return Name;
    }


    public String getIssuerBank() 
    {
        return textField2.getText().trim();
    }

    public String getBankAccount() 
    {
        return textField4.getText().trim();
    }

    public double getBalanceAmount() 
    {
        int balanceAmount = INVALID;
        try {
            balanceAmount = Integer.parseInt(textField5.getText().trim());
            if (balanceAmount <= 0) {
                balanceAmount = INVALID;

            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "Please enter  balance amounnt",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);

        }
        return balanceAmount;
    }

    public int getPinNumber() 
    {
        int pinNumber = INVALID;
        try {
            pinNumber = Integer.parseInt(textField6.getText().trim());
            if (pinNumber <= 0) {
                pinNumber = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "Please enter valid Pin Number",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }

    public void addDebit() 
    {
        String clientName = getClientName();
        String issuerBank = getIssuerBank();
        String bankAccount = getBankAccount();
        int cardId = getCardID();
        double balanceAmount = getBalanceAmount();
        int pinNumber = getPinNumber();

        if (clientName.isEmpty() || issuerBank.isEmpty() || bankAccount.isEmpty()) 
        {
            if(clientName.isEmpty())  
            { 
                JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "please enter client name", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(issuerBank.isEmpty())  
            { 
                JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "please enter issuer bank name", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(bankAccount.isEmpty())  
            { 
                JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "please enter bankAccount ", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                return;
            }
            return;
        }
        if (balanceAmount < 0) 
        {
            JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "Balance Amount cannot be less than 0", "ERROR MESSAGE",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cardId <= 0) {
            JOptionPane.showMessageDialog(frame1, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (pinNumber <= 0 ) {
            JOptionPane.showMessageDialog(frame1,
                    "INVALID INPUT" + "\n" + "Pin Number cannot be less than 0",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkCardIdUnique(cardId) == true){
            array.add(new DebitCard(cardId, bankAccount, (int)balanceAmount, issuerBank, clientName, pinNumber));
            JOptionPane.showMessageDialog(frame1, "DEBIT CARD ADDED!", "Object Added", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(frame1, "card id should be unique","Error box", JOptionPane.ERROR_MESSAGE);
        }
        
        

    }
    public boolean checkCardIdUnique(int cardId) {
        boolean result = true;
        for (BankCard obj : array) {
            if (obj instanceof DebitCard) {
                DebitCard list = (DebitCard) obj;
                if (list.getCardId() == cardId) {
                    result = false;
                }
            }
        }
        return result;
    }
    public boolean checkCreditCardIdUnique(int cardId) {
        boolean result = true;
        for (BankCard obj : array) {
            if (obj instanceof CreditCard) {
                CreditCard list = (CreditCard) obj;
                if (list.getCardId() == cardId) {
                    result = false;
                }
            }
        }
        return result;
    }

    public void showDebit() {
        for (BankCard obj : array) {
            if (obj instanceof DebitCard) {
                DebitCard debitCard = (DebitCard) obj;
                debitCard.display();
            }
        }
    }

    //withdarw
    public int getWCardId() {
        int cardId = INVALID;
        try {
            cardId = Integer.parseInt(textField7.getText().trim());
            if (cardId <= 0) {
                cardId = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid Card Id",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardId;
    }

    public int getWithdrawAmount() {
        int withdrawamount = INVALID;
        try {
            withdrawamount = Integer.parseInt(textField8.getText().trim());
            if (withdrawamount <= 0) {
                withdrawamount = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "Please enter valid withdrawal amount",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return withdrawamount;
    }

    public int getwPinnumber() {
        int pinNumber = INVALID;
        try {
            pinNumber = Integer.parseInt(textField9 .getText().trim());
            if (pinNumber <= 0) {
                pinNumber = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "Please enter valid Pin Number",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return pinNumber;
    }

    public String getWithdrawalDate() {
        String date = "";
        String year = years.getSelectedItem().toString();
        String month = months.getSelectedItem().toString();
        String day = days.getSelectedItem().toString();

        if (year.equals("year") || month.equals("month") || day.equals("day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    public void Withdraw() {
        int pinNumber = getwPinnumber();
        int withdrawAmount = getWithdrawAmount();
        String withdrawalDate = getWithdrawalDate();
        int cardId = getWCardId();

        if (getWithdrawAmount() == 0) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "Withdraw Amount cannot be less than 1", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (getwPinnumber() <= 0 || getPinNumber()!=getwPinnumber()) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "enter Correct Pin Number",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (getWithdrawalDate() == null) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "Enter Valid Withdrawal Date", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (getWCardId() == 0) {
            JOptionPane.showMessageDialog(frame2, "INVALID INPUT" + "\n" + "Enter Valid Card ID", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (BankCard obj : array) {
            if (obj instanceof DebitCard) {
                DebitCard debitCard = (DebitCard) obj;
                if (debitCard.getCardId() == cardId) {
                    debitCard.withdraw(withdrawAmount, pinNumber, withdrawalDate);
                    JOptionPane.showMessageDialog(frame2, "Withdrawal Successful", "Withdraw", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame3, "CARD ID NOT FOUND" + "\n" + "Enter correct Card ID", "NOT FOUND", JOptionPane.WARNING_MESSAGE);
                }

            }
        }

    }
    //credit

    public void showCredit() {
        for (BankCard obj : array) {
            if( obj instanceof CreditCard){
                CreditCard creditCard = (CreditCard) obj;
                creditCard.display();
            }
        }
    }
    public int getCreditCardID() {
        int cardid = INVALID;
        try {
            cardid = Integer.parseInt(textField12.getText().trim());
            if (cardid <= 0) {
                cardid = INVALID;

            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID ERROR" + "\n" + "Please enter valid CardId", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardid;
    }

        public String getCreditClientName() {
        return textField15.getText().trim();
    }

    public String getCreditIssuerBank() {
        return textField16.getText().trim();
    }

    public String getCreditBankAccount() {
        return textField17.getText().trim();

    }

    public double getCreditBalanceAmount() {
        int balanceAmount = 0;
        try {
            balanceAmount = Integer.parseInt(textField18.getText().trim());
            if (balanceAmount < 0) {
                balanceAmount = 0;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter Balance Amount",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return balanceAmount;
    }

    public int getCVCNumber() {
        int CVCNumber = INVALID;
        try {
            CVCNumber = Integer.parseInt(textField10.getText());
            if (CVCNumber < 0) {
                CVCNumber = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid CVC Number",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

        return CVCNumber;
    }

    public double getInterestRate() {
        double interestRate = INVALID;
        try {
            interestRate = Double.parseDouble(textField13.getText());
            if (interestRate <= 0) {
                interestRate = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid Interest Rate",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

        return interestRate;
    }

    public String getExpirationDate() {
        String date = "";
        String year = years2.getSelectedItem().toString();
        String month = months2.getSelectedItem().toString();
        String day = days2.getSelectedItem().toString();

        if (year.equals("year") || month.equals("month") || day.equals("day")) {
            date = null;
        } else {
            date = (year + "-" + month + "-" + day);
        }
        return date;
    }

    
    public void addCreditcard() {
        String clientName = getCreditClientName();
        String issuerBank = getCreditIssuerBank();
        String bankAccount = getCreditBankAccount();
        int cardId = getCreditCardID();
        double balanceAmount = getCreditBalanceAmount();
        double interestRate = getInterestRate();
        int CVCNumber = getCVCNumber();
        String expirationDate = getExpirationDate();
        
        if (clientName.isEmpty() || issuerBank.isEmpty() || bankAccount.isEmpty()) 
        {
            if(clientName.isEmpty()) 
            {
                JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "client Fields cannot be empty",
                "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                
                return;
            }
            if(issuerBank.isEmpty())
            {
                JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "issuer Fields cannot be empty",
                "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                
                return;
            }
            if(bankAccount.isEmpty())
            {
                JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "bank Fields cannot be empty",
                "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                
                return;
            }
            return;
        }
        
        if (CVCNumber <= 0) {
            JOptionPane.showMessageDialog(frame3,
            "INVALID INPUT" + "\n" + "CVC Number cannot be less than 1", "ERROR MESSAGE",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (balanceAmount < 0) {
            JOptionPane.showMessageDialog(frame3,
            "INVALID INPUT" + "\n" + "Balance Amount cannot be less than 0", "ERROR MESSAGE",
            JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (expirationDate == null) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Enter Valid Expiration Date",
            "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (cardId <= 0) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
            "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (interestRate <= 0) {
            JOptionPane.showMessageDialog(frame3,
            "INVALID INPUT" + "\n" + "Rate cannot be less than 1",
            "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (checkCreditCardIdUnique(cardId) == true ){
            array.add(new CreditCard(cardId,  issuerBank, bankAccount, (int) balanceAmount,  CVCNumber,  interestRate,  expirationDate));
            JOptionPane.showMessageDialog(frame3,
            "CREDITCARD ADDED" + "\n" + "Client Name: " + clientName + "\n" + "Card ID: " + cardId +"\n"+ "Issuer Bank: "
            + issuerBank + "\n" + "Bank Account: " + bankAccount + "\n" + "BalanceAmount: " + balanceAmount + "\n"
            + "CVC Number: " + CVCNumber + "\n" + "Interest Rate: " + interestRate + "\n" + "Expiration Date: "
            + expirationDate,
            "DETAILS OF CARD", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(frame3, "card id should be unique",
            "Error box", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void displayCredit() {
        for (BankCard obj : array) {
            if( obj instanceof CreditCard){
                CreditCard creditCard = (CreditCard) obj;
                creditCard.display();
            }
            
    
        }
    }
    
    //credit limit
    public int getCardid() {
        int cardid = INVALID;
        try {
            cardid = Integer.parseInt(textField12.getText());
            if (cardid <= 0) {
                JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                        "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid Card ID",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return cardid;
    }

    public double getCreditLimit() {
        double creditLimit = INVALID;
        try {
            creditLimit = Double.parseDouble(textField18.getText());
            if (creditLimit <= 0) {
                creditLimit = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid CreditLimit",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }

        return creditLimit;
    }

    public int getGracePeriod() {
        int graceperiod = INVALID;
        try {
            graceperiod = Integer.parseInt(textField14.getText());
            if (graceperiod <= 0) {
                graceperiod = INVALID;
            }
        } catch (Exception ae) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid GracePeriod",
                    "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
        return graceperiod;
    }

    public void creditLimit() {
        int cardid = getCardid();
        double creditlimit = getCreditLimit();
        int gracePeriod = getGracePeriod();
        if (cardid == INVALID) {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "CardId cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (creditlimit == INVALID) {

            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Credit Limit cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (gracePeriod == INVALID) {

            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Grace Period cannot be less than 1",
                    "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (BankCard obj : array) {
            if (obj instanceof CreditCard) {
                CreditCard creditCard = (CreditCard) obj;
                if (creditCard.getCardId() == cardid) {
                    creditCard.setCreditLimit(creditlimit, gracePeriod);
                    JOptionPane.showMessageDialog(frame3, "Credit Limit has been set",
                    "Credit Limit", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame3, "CARD ID NOT FOUND" + "\n" + "Enter correct Card ID",
                            "NOT FOUND", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }


//#region for cancel credit card
    public int getCancelCardId() 
    {
        int cardId = INVALID;
        try
         {
            cardId = Integer.parseInt(textField12.getText());
            if (cardId <= 0) 
            {
                cardId = INVALID;
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(frame3, "INVALID INPUT" + "\n" + "Please enter valid card Id",
                    "ERROR MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        return cardId;
    }

    public void cancelCreditCard()
    {
        boolean isfound = false;
        int cardID = getCancelCardId();

        for(BankCard obj: array)
        {
            if(obj instanceof CreditCard)
            {
                CreditCard creditCard = (CreditCard) obj;
                if(creditCard.getCardId()==cardID)
                {
                    isfound = true;
                    creditCard.cancelCreditCard();
                    break;
                }
            }
        }
        if (isfound == true)
         {
            JOptionPane.showMessageDialog(frame3, "Canceled credit card", "success box", JOptionPane.INFORMATION_MESSAGE);
        } else 
        {
            JOptionPane.showMessageDialog(frame2, "cardId doesnt match", "error Box",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public static void main(String[] args)
    {
        BankGUI obj = new BankGUI();
    }   
}
