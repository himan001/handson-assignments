public class PeopleMain{
   public static void main(String[] args) {
    Address address1 = new Address("Maharashta","Pune",411046);
    Address address2 = new Address("Telangana","Hyderabad",456864);

    Account account  =  new Account(1111L,50000);

    Manager manager = new Manager("User1","M",9874615564L,16121997L,address1,1,20000,"IT");
    Programmer programmer = new Programmer("User2","M",48613564L,18021978L,address2,2,30000,"Java");
    Student student = new Student("User3","F",748651465L,18021978L,address2,1001,"First");
    Customer customer = new Customer("User4","F",48651644L,18021978L,address1,4,account);
    Admin admin = new Admin("User5","M",6452148651L,18021985L,address2,3,45000,"AWS");

    display(manager);
    display(programmer);
    display(student);
    display(customer);
    display(admin);

    testUpdate(manager);
    testUpdate(programmer);
    testUpdate(student);
    testUpdate(customer);
    testUpdate(admin);

    display(manager);
    display(programmer);
    display(student);
    display(customer);
    display(admin);
    }

    public void display(People people)
    {
        people.testDisplay();
    }

    public void testUpdate(People people)
    {
        if(people instanceof Manager)
        {
            Manager manager = (Manager)people;
            double Salary = manager.getSalary();
            double amount = Salary*10/100;
            Salary += amount;
            System.out.println("Salary increased by 10% that is : "+amount);
            manager.setSalary(Salary);
        }

        if(people instanceof Programmer)
        {
            Programmer programmer = (programmer)people;
            double Salary = programmer.getSalary();
            double amount = Salary*10/100;
            Salary += amount;
            System.out.println("Salary increased by 10% that is : "+amount);
            programmer.setSalary(Salary);
        }
        if(people instanceof Admin)
        {
            Admin admin = (Admin)people;
            double Salary = admin.getSalary();
            double amount = Salary*10/100;
            Salary += amount;
            System.out.println("Salary increased by 10% that is : "+amount);
            admin.setSalary(Salary);
        }
        if(people instanceof Student)
        {
            Student student = (Student)people;
            student.setGrade("Second")
        }
        
        if(people instanceof Customer)
        {
            Customer customer = (Customer)people;
            customer.updateBalance(5000);
        }
    }
}