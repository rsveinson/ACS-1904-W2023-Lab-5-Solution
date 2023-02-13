
import java.util.Scanner;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Mlas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Politician p = new Politician("Riggs", "Spence", "NDP");
        CabinetMinister m = new CabinetMinister("Kanu", "Osborn", "Tory", "Health");
        Premier pm = new Premier("Churchill", "Riverview", "Whig", 45.3);
        
        ArrayList<Politician> politicians = new ArrayList();
        
        politicians.add(p);
        politicians.add(m);
        politicians.add(pm);
        
        System.out.println(m.getRiding());
        
        System.out.println(m.getCabinetPost());
        
        // System.out.println(politicians.get(1).getCabinetPost());
        
        // System.out.println(politicians.get(1).m.getCabinetPost());
        
        // System.out.println(politicians.get(0).getCabinetPost());
        
        
        
        System.out.println(politicians.get(1) instanceof Premier ? "Premier." : "Not the Premier.");
        
        for(Politician pol : politicians){
            System.out.println(pol);
        }
        
        for(Politician mla : politicians){
            String type = "Backbencher";
            
            System.out.print(mla + " ");
                
            if(mla instanceof CabinetMinister)
                type = "Minister";
                
            if(mla instanceof Premier)
                type = "Premier";
                
            System.out.println(type);
        }

        System.out.println("end of program");
    }
}

