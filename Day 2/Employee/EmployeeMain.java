class EmployeeMain{
    public static void main(String[] args){

        Address a1 = new Address("Maharashta","Pune",411046);
        Address a2 = new Address("Telangana","Hyderabad",456864);
        Employee[] e = new Employee[5];

        e[0] = new Employee(1,"User1",80000,a1);
        e[1] = new Employee(2,"User2",100000,a2);
        e[2] = new Employee(3,"User3",15555);
        e[3] = new Employee(4,"User4",50000,a1);
        e[4] = new Employee(5,"User5",51000);

        for(Employee emp : e)
        {
            if(emp.salary>50000)
                emp.display_add();
        }

        for(Employee emp :e)
        {
            if(emp.address != null)
                emp.display();
        }

    }

}