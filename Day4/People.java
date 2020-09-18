public abstract class People{

    private String name;
    private String gender;
    private long Phone;
    private long dob;
    private Address address;

    People(String name , String gender, long Phone , long dob,Address address)
    {
        this.name = name;
        this.gender =  gender;
        this.Phone = Phone;
        this.dob = dob;
        this.address = address;
    }

    public String getName()
    {
        return this.name;
    }
    public String getgender()
    {
        return this.gender;
    }
    public long  getPhone()
    {
        return this.Phone;
    }
    public long getdob()
    {
        return this.dob;
    }
    public Address getAddress()
    {
        return this.address;
    }
   
     public abstract void testdisplay();

}