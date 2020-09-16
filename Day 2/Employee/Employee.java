class Employee{
    int id;
    String name;
    double salary;
    Address address;

    Employee(int id, String name , double salary)
    {
        this.id =id;
        this.name = name;
        this.salary = salary;
    }
    Employee(int id, String name , double salary, Address address)
    {
        this(id,name,salary);
        this.address = address;
    }
    void display_add()
    {
        System.out.println("=====================");
        System.out.println("Id : "+ this.id);
        System.out.println("Name : "+ this.name);
        System.out.println("Salary : "+ this.salary);
        System.out.println("=====================");        
    }
    void display()
    {
        System.out.println("=====================");
        System.out.println("Id : "+ this.id);
        System.out.println("Name : "+ this.name);
        System.out.println("Salary : "+ this.salary);
        System.out.println("State : " + address.state);
        System.out.println("City : " + address.city);
        System.out.println("Pin : " + address.pin);
        System.out.println("=====================");        
    }
   
}