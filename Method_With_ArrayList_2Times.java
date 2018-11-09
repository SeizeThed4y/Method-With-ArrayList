import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	
public static ArrayList<Integer> twoTimes (ArrayList<Integer> nums){
      ArrayList<Integer> newNums = new ArrayList<>();
      for(int i=0; i<nums.size(); i++){
        newNums.add(nums.get(i));
        newNums.add(nums.get(i));
      }
      return newNums;
    }
	
}