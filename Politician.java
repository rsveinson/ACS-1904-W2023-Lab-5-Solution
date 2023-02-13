import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Politician{

        protected String lastName;
        protected String riding;
        protected String party;
        
        // ** constructors ***
        public Politician(String ln, String r, String p){
            lastName = ln;
            riding = r;
            party = p;
        }
        
        // getters
        public String getName(){
            return lastName;
        }
        
        public String getRiding(){
            return riding;
        }
        
        public String getParty(){
            return party;
        }
        
        // setters
        public void setName(String n){
            lastName = n;
        }
        
        public void setRiding(String r){
            riding = r;
        }
        
        public void setParty(String p){
            party = p;
        }
        
        // other
        @Override
        public String toString(){
            String st = lastName + "-" + riding + ": " + party;
            return st;
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
