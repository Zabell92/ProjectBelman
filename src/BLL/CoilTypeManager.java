/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.CoilType;
import DAL.CoilTypeDBM;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class CoilTypeManager
{

    private CoilTypeDBM ctdb;

    /**
     * creates a new coiltype databasemanager
     *
     * @throws Exception
     */
    public CoilTypeManager() throws Exception
    {
        this.ctdb = new CoilTypeDBM();
    }

    /**
     *
     * @param ID
     * @param Width
     * @return coiltypeID with the specified ID and width
     * @throws Exception
     */
    public ArrayList<CoilType> getByCoilTypeID(int ID, double Width) throws Exception
    {
        return ctdb.getByCoilTypeID(ID, Width);

    }
}
