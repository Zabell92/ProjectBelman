/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

import java.sql.Date;

/**
 *
 * @author MikeZJ
 */
public class ProductionOrder
{

    private int EmployeeID;
    private String POrder;
    private Date DueDate;
    private int Quantity;
    private int MaterialID;
    private double Width;
    private int ID;
    private final int SleeveID;

    public ProductionOrder(int ID, int EmployeeID, String POrder, Date DueDate,
            int Quantity, double Width, int SleeveID)
    {

        this.ID = ID;
        this.EmployeeID = EmployeeID;
        this.POrder = POrder;
        this.DueDate = DueDate;
        this.Quantity = Quantity;
        this.Width = Width;
        this.SleeveID = SleeveID;
    }

    /**
     * @return the POrder
     */
    public String getPOrder()
    {
        return POrder;
    }

    /**
     * @param POrder the POrder to set
     */
    public void setPOrder(String POrder)
    {
        this.POrder = POrder;
    }

    /**
     * @return the DueDate
     */
    public Date getDueDate()
    {
        return DueDate;
    }

    /**
     * @param DueDate the DueDate to set
     */
    public void setDueDate(Date DueDate)
    {
        this.DueDate = DueDate;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity()
    {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity)
    {
        this.Quantity = Quantity;
    }

    /**
     * @return the MaterialID
     */
    public int getMaterialID()
    {
        return MaterialID;
    }

    /**
     * @return the Width
     */
    public double getWidth()
    {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(double Width)
    {
        this.Width = Width;
    }


    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the EmployeeID
     */
    public int getEmployeeID()
    {
        return EmployeeID;
    }

    /**
     * @return the SleeveID
     */
    public int getSleeveID()
    {
        return SleeveID;
    }
}