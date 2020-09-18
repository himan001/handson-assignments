public class Programmer extends Employee {
   
    private String technology;

    Programmer(String name ,String gender,long Phone,long dob ,Address address,int id, double Salary,String technology )
    {
        super(name,gender,Phone,dob,address,id,Salary);
        this.technology= technology;
    }

    
    @Override
    void testDisplay()
    {
        Address address = getAddress();
        System.out.println("=======Programmer========");
        System.out.println("Name : "+ getName());
        System.out.println("Gender : "+ getgender());
        System.out.println("Phone : "+ getPhone());
        System.out.println("Dob : " +  getdob());
        System.out.println("Address : "+ address.city +" " + address.state + " " + address.pin);
        System.out.println("Id : "+ getId());
        System.out.println("Salary : "+getSalary());
        System.out.println("Technology :"+ this.technology);
        System.out.println("========================");
    }
}