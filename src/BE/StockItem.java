/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author MikeZJ
 */
public class StockItem
{

    private final int ID;
    private double StockQuantity;
    private double Length;
    private String ChargeNo;
    private final int SleeveID;
    private final int CoilTypeID;

    public StockItem(int ID, double StockQuantity, double Length, String ChargeNo, int SleeveID, int CoilTypeID)
    {
        this.ID = ID;
        this.SleeveID = SleeveID;
        this.StockQuantity = StockQuantity;
        this.ChargeNo = ChargeNo;
        this.CoilTypeID = CoilTypeID;
        this.Length = Length;

    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the StockQuantity
     */
    public double getStockQuantity()
    {
        return StockQuantity;
    }

    /**
     * @param StockQuantity the StockQuantity to set
     */
    public void setStockQuantity(double StockQuantity)
    {
        this.StockQuantity = StockQuantity;
    }

    /**
     * @return the ChargeNo
     */
    public String getChargeNo()
    {
        return ChargeNo;
    }

    /**
     * @param ChargeNo the ChargeNo to set
     */
    public void setChargeNo(String ChargeNo)
    {
        this.ChargeNo = ChargeNo;
    }

    /**
     * @return the MaterialID
     */
    public int getSleeveID()
    {
        return SleeveID;
    }

    public int getCoilTypeID()
    {
        return CoilTypeID;
    }

    /**
     * @return the Length
     */
    public double getLength()
    {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(double Length)
    {
        this.Length = Length;
    }
}
