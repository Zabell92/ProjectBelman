/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Sleeve;
import DAL.SleeveDBM;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class SleeveManager
{
    private SleeveDBM sldb;
    
   public ArrayList<Sleeve> getBySleeveId(int ID) throws Exception
    {
        return sldb.getBySleeveId(ID);
    }
}
