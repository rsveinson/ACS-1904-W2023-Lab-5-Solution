/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class Student extends Person{
    private String major;
    private int studentNumber;
    
    // constructors
    public Student(){
        major = "Unknown";
        studentNumber = 0;
    }
    
    //String fn, String ln, int by
    public Student(String fn, String ln, int by,  String m, int sn){
        super(fn, ln, by);
        major = m;
        studentNumber = sn;
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
        return firstName + " " + lastName + " " + studentNumber;
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
