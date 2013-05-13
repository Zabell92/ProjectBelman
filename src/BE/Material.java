/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author MikeZJ
 */
public class Material
{
    private final int ID;
    private String MaterialName;
    private double MaterialDensity;
    private double Length;
    private double Width;
    private double Thickness;
    
    
    Material(int ID, String MaterialName, double MaterialDensity, 
            double Length, double Width, double Thickness)
    {
        this.ID = ID;
        this.MaterialName = MaterialName;
        this.MaterialDensity = MaterialDensity;
        this.Length = Length;
        this.Width = Width;
        this.Thickness = Thickness;
        
    }

    public Material(int id, String MaterialName, double MaterialDensity)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the ID
     */
    public int getID()
    {
        return ID;
    }

    /**
     * @return the MaterialName
     */
    public String getMaterialName()
    {
        return MaterialName;
    }

    /**
     * @param MaterialName the MaterialName to set
     */
    public void setMaterialName(String MaterialName)
    {
        this.MaterialName = MaterialName;
    }

    /**
     * @return the MaterialDensity
     */
    public double getMaterialDensity()
    {
        return MaterialDensity;
    }

    /**
     * @param MaterialDensity the MaterialDensity to set
     */
    public void setMaterialDensity(double MaterialDensity)
    {
        this.MaterialDensity = MaterialDensity;
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
}
