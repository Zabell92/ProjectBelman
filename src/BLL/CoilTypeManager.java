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

    public CoilTypeManager() throws Exception
    {
        this.ctdb = new CoilTypeDBM();
    }
    
   public ArrayList<CoilType> getByCoilTypeID(int ID, double Width) throws Exception
    {
        return ctdb.getByCoilTypeID(ID,Width);
        
    }  
}
