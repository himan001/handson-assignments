public class Manager extends Employee{
    private String Department;

    Manager(String name ,String gender,long Phone,long dob ,Address address,int id, double Salary,String Department )
    {
        super(name,gender,Phone,dob,address,id,Salary);
        this.Department = Department;
    }
    

    @Override
    void testDisplay()
    {
        Address address = getAddress();
        System.out.println("=======Manager========");
        System.out.println("Name : "+ getName());
        System.out.println("Gender : "+getgender());
        System.out.println("Phone : "+getPhone());
        System.out.println("Dob : " + getdob());
        System.out.println("Address : "+ address.city +" " + address.state + " " + address.pin);
        System.out.println("Id : "+ getId());
        System.out.println("Salary : "+getSalary());
        System.out.println("Department : "+ this.Department);
        System.out.println("========================");
    }
}