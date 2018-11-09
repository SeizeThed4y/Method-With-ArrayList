import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	
	public static void timesTwo(ArrayList <Integer> nums){
	  
	  	
	int sum = 0;
		for (int i = 0; i < nums.size(); i++) {
				
			sum = nums.get(i) + nums.get(i);
			
			nums.set(i, sum);
		}
  
	}
	
}