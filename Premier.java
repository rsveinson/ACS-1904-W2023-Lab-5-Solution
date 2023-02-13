import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Premier extends Politician{
    
    private double approvalRating;
    
    public Premier(String ln, String r, String p,
                            double ap){
        super(ln, r, p);
        approvalRating = ap;
    }

    // getters
    public double getApprovalRating(){
        return approvalRating;
    }
    
    // setters
    
    // other
    // @Override
    // public String toString(){
        // String st = "Hn " + lastName + ", " + party + ": Approval " + approvalRating + "%.";
        // return st;
    // }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hn " + lastName);
        sb.append(", " + party + ": Approval ");
        sb.append(approvalRating + "%.");
        return sb.toString();
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
