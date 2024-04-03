class box{
	
	int width;
	int height;
	int length;
	
	static int count = 0;
	 //static 
	 //{ 
	 //	count = 0;
	 //}
	
	box(){
		
	 width = 1;
	 height = 1;
	 length = 1;	
	 count++;
		
	}
	
	box(int a,int b,int c){
		
		width = a;
		height = b;
		length = c;
		count++;
		
	}
	
	box(box obj){
		
		width = obj.width;
		height = obj.height;
		length = obj.length;
		count++;
		
	}
	
	public void Volume(){
		
		System.out.println("\n\n" + width * height * length);
		
	}
	
	static void display(){
		
		//Static Method
		
		System.out.println("Number of Boxes So Far Created: " + count);
		
	}
	
}

class P4
{
	public static void main(String [] args)
	{
		
	box b1 = new box();
	box b2 = new box(4,5,6);
	box b3 = new box(b2);
	b1.Volume();
	b2.Volume();
	b3.Volume();
	box.display();
	}
}