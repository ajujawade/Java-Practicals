class P1{
	
	
	public static void main(String [] args)
	{
		
		int a[] = {900,600,600,500,1000};
		int k,j,temp,ub=a.length - 1;
		
		for (k = 0; k < ub - 1; k++)
		{
			
			for (j=0; j < ub - k ; j++)
			{
				if(a[j] > a[j + 1])
				{
					
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
	
				}
			}
		}
		
		System.out.println("Array After Sorting ");
		for (j = 0; j <= ub; j++)
		{
			
			System.out.println(a[j]);
			
		}
		
	}
}
	