class factorial{
	
	long fact(int n){
		
		if(n == 0)
		{
			
			return 1;
			
		}
		else
		{
			
			return fact(n - 1)*n;
			
		}
		
	}
	
}

class P5{
	
	public static void main(String [] args){
		
		factorial f1 = new factorial();
		int n = 5;
		System.out.println("Factorial Of " + n + " Is : " + f1.fact(n));
		
	}
	
}