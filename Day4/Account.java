public class Account{
    long accountNo;
    double balance;

    Account(long accountNo, double balance)
    {
        this.accountNo =accountNo;
        this.balance = balance;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return this.balance;
    }

}