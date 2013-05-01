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
    private int StartTime;
    private int EndTime;
    
    
    public Employee(int ID, String Name, int StartTime, int EndTime)
    {
        this.ID = ID;
        this.Name = Name;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        
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

    /**
     * @return the StartTime
     */
    public int getStartTime()
    {
        return StartTime;
    }

    /**
     * @param StartTime the StartTime to set
     */
    public void setStartTime(int StartTime)
    {
        this.StartTime = StartTime;
    }

    /**
     * @return the EndTime
     */
    public int getEndTime()
    {
        return EndTime;
    }

    /**
     * @param EndTime the EndTime to set
     */
    public void setEndTime(int EndTime)
    {
        this.EndTime = EndTime;
    }
}
