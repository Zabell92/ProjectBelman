/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.ProductionOrder;
import DAL.ProductionOrderDBM;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class ProductionOrderManager
{
    private ProductionOrderDBM mdb = null;
    
    public ArrayList<ProductionOrder> showAll() throws SQLException
    {
        return mdb.showAll();
    }
}
