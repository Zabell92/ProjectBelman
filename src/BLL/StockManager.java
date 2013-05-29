/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.StockItem;
import DAL.StockDBM;
import java.util.ArrayList;

/**
 *
 * @author Aka
 */
public class StockManager
{

    private StockDBM sdb;

    /**
     *
     * Creates a new Stock database manager
     */
    public StockManager() throws Exception
    {
        this.sdb = new StockDBM();
    }

    /**
     *
     * @param ID
     * @return the sleeves with specified ID from the stockitem list
     */
    public ArrayList<StockItem> getBySleeveId(int ID) throws Exception
    {
        return sdb.getBySleeveId(ID);

    }
}
