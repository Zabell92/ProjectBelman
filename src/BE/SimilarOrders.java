/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.sql.Date;

/**
 *
 * @author Aka
 */
public class SimilarOrders
{
   private final int ID;
    private double Thickness;
    private double Circumference;
    private int StartTime;
    private int EndTime;
    private final int MaterialID;
 
    public SimilarOrders(int ID, double Thickness, double Circumference, int StartTime, int EndTime, int MaterialID)
    {
        this.ID = ID;
        this.Thickness = Thickness;
        this.Circumference = Circumference;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.MaterialID = MaterialID; 
    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the Thickness
     */
    public double getThickness()
    {
        return Thickness;
    }

    /**
     * @param Thickness the Thickness to set
     */
    public void setThickness(double Thickness)
    {
        this.Thickness = Thickness;
    }

    /**
     * @return the Circumference
     */
    public double getCircumference()
    {
        return Circumference;
    }

    /**
     * @param Circumference the Circumference to set
     */
    public void setCircumference(double Circumference)
    {
        this.Circumference = Circumference;
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

    /**
     * @return the MaterialID
     */
    public int getMaterialID()
    {
        return MaterialID;
    }
}
