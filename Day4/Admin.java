public class Admin extends Employee{
  
    String server;

    Admin(String name ,String gender,long Phone,long dob ,Address address,int id, double Salary,String server )

    {
        super(name,gender,Phone,dob,address,id,Salary);
        this.server = server;
    }

 
    @Override
    void testDisplay()
    {
        Address address = getAddress();
        System.out.println("=======Admin========");
        System.out.println("Name : "+ getName());
        System.out.println("Gender : "+getgender());
        System.out.println("Phone : "+getPhone());
        System.out.println("Dob : " + getdob());
        System.out.println("Address : "+ address.city +" " + address.state + " " + address.pin);
        System.out.println("Id : "+getId());
        System.out.println("Salary : "+getSalary());
        System.out.println("Server : "+ this.server);

        System.out.println("========================");
    }
}