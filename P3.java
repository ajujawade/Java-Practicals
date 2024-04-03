class box{
	
	int width,height,length;
	//constructor
	box(){
		// Default Constructor
		width = 1;
		height = 1;
		length = 1;
	}
	box(int a,int  b,int c){
		
		// Parameterized Constructor 
		
		width = a;
		height = b;
		length = c;
				
	}
	box(box bo){
		
		// Copy Constructor
		
		width = bo.width;
		height = bo.height;
		length = bo.length;
		
	}
	void Volume(){
		
		System.out.println("\n\n" + width * height * length);
		
	}
	
}

class P3{
	
	public static void main(String [] args){
		
		box b1 = new box();
		box b2 = new box(10,20,30);
		box b3 = new box(b2);
		
		System.out.println("Volume Of The Boxes");
		b1.Volume();
		b2.Volume();
		b3.Volume();
	}	
	
}