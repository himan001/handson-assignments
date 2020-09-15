class Result
{
	public static void main(String args[])
	{
		int marks = Integer.parseInt(args[0]);
		if(marks>=70)
			System.out.println("First Class Distinction");
		else if(marks>=60 && marks<70)
			System.out.println("First Class");
		else if(marks>=50 && marks<60)
			System.out.println("Second Class");
		else if(marks>=35 && marks<50)
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}
}