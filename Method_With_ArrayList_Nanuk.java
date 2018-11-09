import java.util.*;

class Main {
  public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) 
  {
    int nCnt = 0, sum = 0;
        for (String hnt : r) {
            if (hnt.equalsIgnoreCase("nanuk")) {
                nCnt++;
            } else {
                sum += Integer.parseInt(hnt);
            }
        }
        if(way_stones >= nCnt && sum >= boast){
          return true;
        }
        
        return false;
        
         
  }
  
  public static void main(String[] args)
  {
   
    ArrayList<String>  arr = new ArrayList<String>();
    arr.add("2");
    arr.add("6");
    arr.add("nanuk");
    arr.add("nanuk");
    
  
    boolean hunt = nanuk(arr,2,10);
    if(hunt)
    {
      System.out.print("successful hunt");
    }
    else
    {
      System.out.print("this hunt is doomed");
    }
    
  
   
    
  }//end main
}