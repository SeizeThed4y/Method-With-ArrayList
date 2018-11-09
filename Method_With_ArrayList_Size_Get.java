import java.util.ArrayList;

class Main
{
	public static int sum(ArrayList<Integer> ints)
	{
	  
	  int sum = 0;
		for(int i = 0; i < ints.size(); i++){
		  sum+= ints.get(i);
		}
		
		return sum;
	}
}