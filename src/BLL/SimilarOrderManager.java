/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.ProductionOrder;
import DAL.SimilarOrdersDBM;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Aka
 */
public class SimilarOrderManager
{

    private SimilarOrdersDBM sodb;

    /**
     *
     * Creates a new similarOrdersDBM
     */
    public SimilarOrderManager() throws Exception
    {
        sodb = new SimilarOrdersDBM();
    }

    /**
     *
     * @param Width
     * @return the similar orders with the specified width in the productionorder list
     */
    public ArrayList<ProductionOrder> getSimilarOrders(double Width) throws SQLException
    {
        return sodb.getSimilarOrders(Width);
    }
}
