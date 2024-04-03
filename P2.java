class P2{
	
	public static void main(String [] args){
		
		String a[] = {"Delhi","Mumbai","Kolkata","Nagpur","Gujrat"};
		int i,j,ub = a.length - 1;
		for(i = 0; i < ub ; i++){
			
			for(j = 0; j <ub - i; j++){
				
				if(a[j].compareTo(a[j + 1])>0){
					
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
				
			}
			
		}
		System.out.println("Array After Sorting");
		for (j = 0; j <= ub; j++){
			
			System.out.println(a[j]);
			
		}
	}
	
	
}