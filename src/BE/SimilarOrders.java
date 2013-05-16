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
}
