/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Sleeve;
import DAL.SleeveDBM;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class SleeveManager
{

    private SleeveDBM sldb;

    /**
     *
     * Creates a new SleeveDBM
     */
    public SleeveManager() throws Exception
    {
        this.sldb = new SleeveDBM();
    }

    /**
     *
     * @param ID
     * @return the sleeves with specifeid ID from the sleeve list
     * @throws Exception
     */
    public ArrayList<Sleeve> getBySleeveId(int ID) throws Exception
    {
        return sldb.getBySleeveId(ID);

    }
}
