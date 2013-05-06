/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Sleeve;
import DAL.SleeveDBM;

/**
 *
 * @author MikeZJ
 */
public class SleeveManager
{
    private SleeveDBM sldb;
    
   public Sleeve getBySleeveId(int ID) throws Exception
    {
        return sldb.getBySleeveId(ID);
    }
}
