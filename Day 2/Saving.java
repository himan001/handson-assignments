class Saving{
    public static void main(String [] args)
    {
        SavingsAccount s1 = new SavingsAccount(1234567890L,"User1","Maharashtra","Pune",411046);
        SavingsAccount s2 = new SavingsAccount(1234505468L,"User2","Gujarat","Surat",453222);
        SavingsAccount s3 = new SavingsAccount(1245328644L,"User3","Tamil Nadu", "Chennai",100000,456145);
        SavingsAccount s4 = new SavingsAccount(6548864665L,"User4","Telangana","Hyderabad",70000,535445);

        s1.display();
        s1.deposit(10000);
        s1.display();

        s2.display();
        s2.withdraw(5000);

        s3.display();
        s3.withdraw(5000);
        s3.display();

        s4.display();
        s4.withdraw(80000);
        s4.deposit(15000);
        s4.display();
        s4.withdraw(80000);
        s4.display();
    }
}