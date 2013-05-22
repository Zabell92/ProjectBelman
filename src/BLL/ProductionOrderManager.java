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

    public void insertData(long TimeUsed, int EmployeeID, int ID) throws SQLException
    {
        podb.insertData(TimeUsed, EmployeeID, ID);
    }

    public void updateIsDone(int ID) throws SQLException
    {
        podb.updateIsDone(ID);
    }

    public void updateEmployee(int ID, String Name) throws SQLException
    {
        podb.updateEmployee(ID, Name);
    }
    
    public ArrayList<ProductionOrder> getTime(int ID) throws SQLException
    {
        return podb.getTime(ID);
        
    }
}
