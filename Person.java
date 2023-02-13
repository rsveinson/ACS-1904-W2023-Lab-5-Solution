/** 
 * ACS-1904 lab 5
 * @Sveinson
*/

public class Person{
    protected String firstName;
    protected String lastName;
    protected int birthYear;
    
    // constructors
    public Person(){
        firstName = "unknown";
        lastName = "unknown";
        birthYear = 0;
    }
    
    public Person(String fn, String ln, int by){
        firstName = fn;
        lastName = ln;
        birthYear = by;
    }
    
    // getters
    
    // setters
    
    // other
    /*****************************************
    * Description: gets ther person's name (first name last name)
    * 
    * @return       String: full name
    * ****************************************/  
    public String getName(){
        return firstName + " " + lastName;
    }
    
    /*****************************************
    * Description: overrides toString() gets the persons name and birthyear
    * 
    * @return      String: person info
    * ****************************************/ 
    @Override
    public String toString(){
        return getName() + ": " + birthYear;
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
