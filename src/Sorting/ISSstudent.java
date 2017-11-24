package Sorting;
public class ISSstudent implements Comparable {

    private String name, address;
    private int id;
    
    public ISSstudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public int getId(){
        return id;
    }
    
    
    public String getName(){
        return name;
    }
    
    
    public String toString(){
        String str = "Name: \t" + name;
        str += "\nAddress:\t" + address;
        str += "\nStudent ID:\t" + id;
        return str;
    }
    
    @Override
    public int compareTo(Object t) {
        String othername = ((ISSstudent)t).getName();
       return this.name.compareTo(othername);
    }
    
}
