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
    
    
   public Material(int ID, String MaterialName, double MaterialDensity)
    {
        this.ID = ID;
        this.MaterialName = MaterialName;
        this.MaterialDensity = MaterialDensity;
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
}


