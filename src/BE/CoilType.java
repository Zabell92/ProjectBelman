/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author MikeZJ
 */
public class CoilType
{

    private final int ID;
    private final int MaterialID;
    private double Width;
    private double Thickness;
    private String Code;

    public CoilType(int ID, int MaterialID, double Width,
            double Thickness, String Code)
    {
        this.ID = ID;
        this.MaterialID = MaterialID;
        this.Width = Width;
        this.Thickness = Thickness;
        this.Code = Code;

    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
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
}
