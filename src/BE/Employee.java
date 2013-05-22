/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author MikeZJ
 */
public class Employee
{

    private final int ID;
    private final String Name;

    public Employee(int ID, String Name)
    {
        this.ID = ID;
        this.Name = Name;


    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the Name
     */
    public String getName()
    {
        return Name;
    }
}
