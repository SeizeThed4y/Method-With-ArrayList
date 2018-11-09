import java.util.*;

class Main {
  public String blogDb(ArrayList<String[]> r,String id)  {
    for(int i = 0; i < r.size(); i++){
      if(r.get(i)[0] == id ){
        return r.get(i)[1] + "\n" + r.get(i)[2];
      }
    }
    return "";
    
   
  }
  
  public static void main(String[] args) {
    Main m = new Main();
    ArrayList<String[]>  arr = new ArrayList<String[]>();
    arr.add(new String[]{"1","title 1","content"});
    arr.add(new String[]{"2","title 2","content"});
    arr.add(new String[]{"3","title 3","content3"});

    String post = m.blogDb(arr,"3");
    System.out.print(post);
    //should output:
    //title 3 
    //content3
   
    
  }//end main
}