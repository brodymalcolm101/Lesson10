
package Searching;

public class SearchSimple {

    
  static int attempts;
   
    public static void main(String[] args) {
   	String names[] = {"Alpha", "Bravo", "Charlie", "Delta", "Foxtrot", "Golf", "Hotel"};
        // search for Foxtrot
        String name = "Foxtrot";
        int loc = search(names,name);
        
        System.out.println(name + " is found at " + loc + " it took " + attempts + " attempts");
}
    
    public static int search (Object[] a, Object searchValue){
	   int left = 0;
	   int right = a.length-1;
	   while (left <= right){
               attempts ++;
	      int midpoint = (left + right) / 2;
	      int result = ((Comparable)a[midpoint]).compareTo(searchValue); 
	      if (result == 0)
	         return midpoint;
	      else if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   return -1;	
		   
}
    
    }
    

