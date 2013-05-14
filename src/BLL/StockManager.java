/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Sleeve;
import BE.StockItem;
import DAL.SleeveDBM;
import DAL.StockDBM;
import java.util.ArrayList;

/**
 *
 * @author Aka
 */
public class StockManager
{
    private StockDBM sdb;

    public StockManager() throws Exception
    {
        this.sdb = new StockDBM();
    }
    
   public ArrayList<StockItem> getBySleeveId(int ID) throws Exception
    {
        return sdb.getBySleeveId(ID);
        
    } 
}
