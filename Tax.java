class Tax{
	public static void main(String args[]){
		double num  = Double.parseDouble(args[1]);
		switch(args[0])
		{
			case "KA":
				num = num - (num*10/100);
				break;
			case "MH":
				num = num - (num*12/100);
				break;
			case "TN":
				num= num - (num*10.5/100);
				break;
			case "TE":
				num=num- (num*5/100);
				break;
			default :
				System.out.println("The state is not in the database");
		}
		System.out.println("The final amount after Tax Deduction is " + num); 
	}	
}