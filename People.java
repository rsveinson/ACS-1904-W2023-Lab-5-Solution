import java.util.ArrayList;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class People{
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList();
        
        Person p = new Person("Johnny", "Von Neumann", 1903);
        Instructor i = new Instructor("Alan", "Turing", 1912, "B.A.", 1105);
        Student s = new Student("Richard", "Feynman", 1918, "Philosophy", 112);
        
        people.add(p);
        people.add(s);
        people.add(i);
        
        for(Person person : people)
            System.out.println(person.getName());

        System.out.println("\nend of program");
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
