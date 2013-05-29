/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.ProductionOrder;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Collection;
import java.util.Locale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aka
 */
public class ProductionOrderManagerTest
{
    static ProductionOrderManager pomgr;

    public ProductionOrderManagerTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
        System.out.println("-----------------Starting junittest-----------------");
        pomgr = new ProductionOrderManager();
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of showAll method, of class ProductionOrderManager.
     */
    @Test
    public void testShowAll() throws Exception
    {
//        String DueDate = "2014-03-04";
//        DateFormat df = new SimpleDateFormat("yyyy-dd-mm");
//        Date date = (Date) df.parse(DueDate);
//
//        System.out.println("showAll");
//        ProductionOrderManager instance = new ProductionOrderManager();
//        ArrayList<ProductionOrder> expResult = new ArrayList<>();
//        expResult.add(new ProductionOrder(123, 0, "5811-12004-010-7", date, 69, 1235, 1, false, 0));
//        ArrayList result = instance.showAll();
//
//        System.out.println(result.isEmpty());
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        
        System.out.println("Testing showall for the productionOrderManager: ");
        try
        {
            pomgr = new ProductionOrderManager();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error - pomgr threw a FileNotFoundException: " + ex.getMessage());
        }
        System.out.println("Showing all produtionorder items: " + pomgr.showAll().size() + "\n");
        
    }

    /**
     * Test of updateTime method, of class ProductionOrderManager.
     */
    @Test
    public void testUpdateTime() throws Exception
    {
        System.out.println("updateTime");
        long TimeUsed = 654321;
        int EmployeeID = 0;
        int ID = 0;
        ProductionOrderManager instance = new ProductionOrderManager();
        instance.updateTime(TimeUsed, EmployeeID, ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateIsDone method, of class ProductionOrderManager.
     */
    @Test
    public void testUpdateIsDone() throws Exception
    {
        System.out.println("updateIsDone");
        int ID = 0;
        ProductionOrderManager instance = new ProductionOrderManager();
        instance.updateIsDone(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class ProductionOrderManager.
     */
    @Test
    public void testUpdateEmployee() throws Exception
    {
        System.out.println("updateEmployee");
        int ID = 0;
        String Name = "";
        ProductionOrderManager instance = new ProductionOrderManager();
        instance.updateEmployee(ID, Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class ProductionOrderManager.
     */
    @Test
    public void testGetTime() throws Exception
    {
        System.out.println("getTime");
        int ID = 0;
        ProductionOrderManager instance = new ProductionOrderManager();
        int expResult = 0;
        int result = instance.getTime(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}