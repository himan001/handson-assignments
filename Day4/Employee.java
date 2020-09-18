public abstract class Employee extends People{

    private int id;
    private double Salary;
        
    Employee(String name ,String gender,long Phone,long dob ,Address address,int id, double Salary){
        super(name,gender,Phone,dob,address);
        this.id = id;
        this.Salary = Salary;
    }

    public void setSalary(double Salary)
    {
        this.Salary = Salary;
    }
    public int getId()
    {
        return this.id;
    } 
    public double getSalary()
    {
        return this.Salary;
    }
    public void testdisplay(){
        System.out.println("This method will not print anything");

    }
}
