import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static void repeatAL(ArrayList <Boolean> b1){
		
		  int originalSize = b1.size();
		  for(int i = 0; i < originalSize; i++) {
			  
			  b1.add(b1.get(i));
			  
		  }
	
}
}