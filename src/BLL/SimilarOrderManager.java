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

    public SimilarOrderManager() throws Exception
    {
        sodb = new SimilarOrdersDBM();
    }

    public ArrayList<ProductionOrder> getSimilarOrders(double Width) throws SQLException
    {
        return sodb.getSimilarOrders(Width);
    }
}
