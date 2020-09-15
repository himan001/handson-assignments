class SumMaxMin{
	public static void main(String args[]){
		int sum = 0;
		int temp;
		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[0]);
		for(int i=0;i<args.length;i++){
			temp = Integer.parseInt(args[i]);
			sum+=temp;
			if(temp>max)
				max =temp;
			if(temp<min)
				min = temp;
		}
		System.out.println("The sum is = "+sum);
		System.out.println("The Max number is =" +max);
		System.out.println("The Min number is =" +min);
	}
}