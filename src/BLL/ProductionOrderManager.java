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

    /**
     *
     * Creates a new ProductionOrderDBM
     */
    public ProductionOrderManager() throws Exception
    {
        podb = new ProductionOrderDBM();
    }

    /**
     *
     * @return all the produtionsorders
     * @throws SQLException
     */
    public ArrayList<ProductionOrder> showAll() throws SQLException
    {
        return podb.showAll();
    }

    /**
     * update the time in the database
     *
     * @param TimeUsed
     * @param EmployeeID
     * @param ID
     *
     */
    public void updateTime(long TimeUsed, int EmployeeID, int ID) throws SQLException
    {
        podb.updateTime(TimeUsed, EmployeeID, ID);
    }

    /**
     *
     * @param ID Update the Done time in the database
     */
    public void updateIsDone(int ID) throws SQLException
    {
        podb.updateIsDone(ID);
    }

    /**
     *
     * @param ID
     * @param Name update the employees in the database
     */
    public void updateEmployee(int ID, String Name) throws SQLException
    {
        podb.updateEmployee(ID, Name);
    }

    /**
     *
     * @param ID
     * @return the time
     */
    public int getTime(int ID) throws SQLException
    {
        return podb.getTime(ID);

    }

    public ArrayList<ProductionOrder> getSimilarOrders(double Width) throws SQLException
    {
        return podb.getSimilarOrders(Width);
    }
}
