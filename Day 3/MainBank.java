public class MainBank {
    public static void main(String[] args) {


        //Asssignment  1
        /* long accountNo = Long.parseLong(args[0]);
        double amount = Double.parseDouble(args[1]);
        Account account = getAccount(accountNo);
        if(account == null)
        {
            System.out.println("Sorry!!! Bank account not found.");
        }
        else
        {
                account.accountInformation();
                account.setBalance(account.getBalance()+amount);
                account.accountInformation();
        }*/

        //pass the accountNo and amount to deposit from CLA
        //get the Account using the accountNo by calling getAccount(...)
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        
        // show the account information before deposit
        //deposit the amount to that particular Account
        //show the account information after deposit
    
    
        //Assignment 2 
        long accountNo1 = Long.parseLong(args[0]);
        long accountNo2 = Long.parseLong(args[1]);
        double amount = Double.parseDouble(args[2]);
        double bal ;
        Account account1 = getAccount(accountNo1);
        Account account2 = getAccount(accountNo2);
        
        if(account1 == null || account2 == null)
            System.out.println("Please check the account number!!");
        else{
                bal = account1.getBalance();
                if(amount>bal)
                    System.out.println("Insufficient Balance!!");
                else{
                    account1.accountInformation();
                    account2.accountInformation();
                    account1.withdraw(amount);
                    account2.deposit(amount);
                    account1.accountInformation();
                    account2.accountInformation();
                }
        }
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();
        long accNo;
        Account account = null;
        // get the account from accounts using the accountNo

        for( Account a : accounts)
        {
           accNo = a.getAccountNumber();
           if(accNo == accountNo)
           {
                account = a;
                break;
           }
        }
        return account;
    }
}