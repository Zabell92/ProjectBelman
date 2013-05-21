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

    private ProductionOrderDBM podb;

    public ProductionOrderManager() throws Exception
    {
        podb = new ProductionOrderDBM();
    }

    public ArrayList<ProductionOrder> showAll() throws SQLException
    {
        return podb.showAll();
    }

    public ArrayList<ProductionOrder> insertTime(int TimeUsed, int ID) throws SQLException
    {
        return podb.insertTime(TimeUsed, ID);
    }
    
    public void updateIsDone(int ID) throws SQLException
    {
        podb.updateIsDone(ID);
    }
}
