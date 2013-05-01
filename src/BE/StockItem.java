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
    private final int MaterialID;
    private double StockQuantity;
    private String Code;
    private String ChargeNo;
    public StockItem(int ID, int MaterialID, double StockQuantity, String Code, String ChargeNo)
    {
        this.ID = ID;
        this.MaterialID = MaterialID;
        this.StockQuantity = StockQuantity;
        this.Code = Code;
        this.ChargeNo = ChargeNo;
        
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
     * @return the Code
     */
    public String getCode()
    {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(String Code)
    {
        this.Code = Code;
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
    public int getMaterialID()
    {
        return MaterialID;
    }
}
