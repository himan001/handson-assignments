class SavingsAccount  {
    String name;
    String ifsc;
    long accountNo;
    double balance;
    String state;
    String city;
    int pin;

    SavingsAccount(long accountNo_n, String name_n,String state_n, String city_n, int pin_n){

        name = name_n;
        accountNo = accountNo_n;
        state=state_n;
        city = city_n;
        pin=pin_n;
        balance = 0.0;
        ifsc ="HSBC001";
        }
    SavingsAccount(long accountNo_n, String name_n,String state_n, String city_n , double balance_n, int pin_n){
        name = name_n;
        accountNo = accountNo_n;
        state=state_n;
        city = city_n;
        pin = pin_n;
        balance = balance_n;
        ifsc ="HSBC001";

    }
    void deposit(double amount){
        System.out.println("Transaction completed successfully!!"); 
        balance+=amount;
        System.out.println("The updated balance is : "+balance);
    }
    void withdraw(double amount){
        if(amount > balance)
            System.out.println("You do not have enough balance");
        else{
            System.out.println("Transaction completed successfully!!");
            balance=balance-amount; 
            System.out.println("The updated balance is : " + balance);
        }
    }
    void display(){

        System.out.println("====================================================");
        System.out.println("The bank details are -");
        System.out.println("Name : "+ name);
        System.out.println("Account Number : "+ accountNo);
        System.out.println("IFSC Code : "+ ifsc);
        System.out.println("City : "+ city);
        System.out.println("State : "+ state);
        System.out.println("Pin : " + pin);
        System.out.println("Balance : "+ balance);
        System.out.println("====================================================");

    }
}