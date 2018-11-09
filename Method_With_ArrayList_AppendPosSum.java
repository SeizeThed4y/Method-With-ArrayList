import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		
	}
	//create your method below
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> incoming) {

		int sum = 0;

		for (int i = 0; i < incoming.size(); i++) {
			if (incoming.get(i) <= 0) {						//==> Remove All Negatives and 0s
				incoming.remove(incoming.get(i));
				i--;

			} else {

				sum += incoming.get(i);  //if the number is positive add to sum and get the sum

			}

		}

		incoming.add(sum);  

		return incoming;

	}
	
}