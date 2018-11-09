import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Main {
  public static String combineRs(String[] r1,String[] r2) 
  {
  
  
  List <String> list = new ArrayList<>();
  
  
  String ret = "";
    
      for(String str : r1)
        list.add(str);
        
      for(String str : r2)
      list.add(str);
      
      for(String str : list)
      ret += str;
      
      return ret;
      
        
      
    
   
  }
}