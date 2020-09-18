public class Customer extends People{
    private int id;
    private Account account;

    Customer(String name ,String gender,long Phone,long dob ,Address address,int id,Account account)
    {
        super(name,gender,Phone,dob,address);
        this.id= id;
        this.account = account;
    }

    public void updateBalance(double amount)
    {
        double balance =account.getBalance();
        balance+=amount;
        account.setBalance(balance);
    }

    @Override
    public void testDisplay()
    {
        Address address = super.getAddress();
        System.out.println("=======Customer========");
        System.out.println("Name : "+ super.getName());
        System.out.println("Gender : "+super.getgender());
        System.out.println("Phone : "+super.getPhone());
        System.out.println("Dob : " + super.getdob());
        System.out.println("Address : "+ address.city +" " + address.state + " " + address.pin);
        System.out.println("Id : "+ this.id);
        System.out.println("Account balance: " + account.balance);
        System.out.println("Account Number :" + account.accountNo);
        System.out.println("========================");
    }

}