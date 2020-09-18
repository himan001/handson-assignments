public class Student extends People{
    private int RollNo;
    private String grade;
    
    Student(String name ,String gender,long Phone,long dob ,Address address,int RollNo, String grade)
    {
        super(name,gender,Phone,dob,address);
        this.RollNo = RollNo;
        this.grade = grade;
        
    }
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    @Override
    void testDisplay()
    {
        Address address = super.getAddress();
        System.out.println("=======Manager========");
        System.out.println("Name : "+ super.getName());
        System.out.println("Gender : "+super.getgender());
        System.out.println("Phone : "+super.getPhone());
        System.out.println("Dob : " + super.getdob());
        System.out.println("Address : "+ address.city +" " + address.state + " " + address.pin);
        System.out.println("Id : "+ this.RollNo);
        System.out.println("Grade : "+this.grade);
        System.out.println("========================");
    }
    
   
}