package Searching;


public class StringReview {
// hi there its michael man here mister mouse in the cheese sauce
   
    public static void main(String[] args) {
        
       String x = "The quick brown fox";
       //          0123456789012345678
       //Index of finds location of something, returns an int
       int loc = x.indexOf("q");
        System.out.println("q is at " + loc);
        loc = x.indexOf("o", 13);
        System.out.println(" Starting at 13, o is at " + loc);
         loc = x.indexOf("q", 13);
        System.out.println(" Starting at 13, q is at " + loc);
        // -1 = not found 
        
        //charAt - returns a char ay a given location
        char c = x.charAt(13);
        System.out.println("The character at 13 is " + c);
        
        //length 
        int len = x.length();
        System.out.println(x + " is " + len + " characters long");
        
        //substring -  returns a string that is part of the original string
        String y = x.substring(10, 13); // 13 not included and starts at 10
        System.out.println(y);
        y = x.substring(16); //starts at 16 prints to the end
        System.out.println(y);
        
        System.out.println(x.toUpperCase()); // call as you print the string
        
        //compareTo -> 
        y = "jumped over the lazy dog";
        x = x.toLowerCase();
        int z = x.compareTo(y);
        System.out.println("x compared to y is " + z);
        int v = y.compareTo(x);
        System.out.println("y compared to x is " + v);
        //"t"he vs "j"umped - 10 letters away - 10
        //positive first thing is further down the alphabet
        
        System.out.println("Bob vs Andy".compareTo("Andy vs Bob"));
        System.out.println("bob".compareTo("beb")); // b is tied so it goes to e and o
        System.out.println("Bob".compareTo("bob"));
        
        //moral of story -> compareTo = 0 means you have an exact match
        
    }
    
}
