/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author MikeZJ
 */
public class SalesOrder
{

    private final int ID;
    private String SOrder;
    private int POrderID;

    SalesOrder(int ID, String SOrder, int POrderID)
    {
        this.ID = ID;
        this.SOrder = SOrder;
        this.POrderID = POrderID;

    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the SOrder
     */
    public String getSOrder()
    {
        return SOrder;
    }

    /**
     * @param SOrder the SOrder to set
     */
    public void setSOrder(String SOrder)
    {
        this.SOrder = SOrder;
    }

    /**
     * @return the POrderID
     */
    public int getPOrderID()
    {
        return POrderID;
    }

    /**
     * @param POrderID the POrderID to set
     */
    public void setPOrderID(int POrderID)
    {
        this.POrderID = POrderID;
    }
}
