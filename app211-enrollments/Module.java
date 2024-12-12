
/**
 * This class represents a course module and contains.
 * Information on the module title and code.
 *
 * @author (Vincent Ogieva)
 * @version (1.0 15/10/2021)
 */
public class Module
{
    // instance variables - replace the example below with your own

    private String code; 

    private String title;

    private int credit; 

    /**
     * Constructor for objects of class modules
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        credit = 15;
        this.code = code;
        this.title = title;
    }

    public String getCode()
    {
         return code;    
    }
     
    public String getTitle()
    {
         return title;     
    
    } //end of method 
    
    public void setCredit(int credit)
    {
        this.credit = credit; 
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " 
                            + title + " credit " + credit);
        System.out.println();
    }
     
    
}//end of class

