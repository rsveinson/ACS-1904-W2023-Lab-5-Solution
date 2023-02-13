/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class Instructor extends Person{
    private String degree;
    private int office;
    
    // constructors
    public Instructor(){
        degree = "Unknown";
        office = 0;
    }
    
    //String fn, String ln, int by
    public Instructor(String fn, String ln, int by,  String d, int o){
        super(fn, ln, by);
        degree = d;
        office = o;
    }
    
    //getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets the instructor's name and degree
    * 
    * @return       String: initial name and degree
    * ****************************************/  
    public String getName(){
        return firstName.charAt(0) + ". " + lastName + " " + degree;
    }
        

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
