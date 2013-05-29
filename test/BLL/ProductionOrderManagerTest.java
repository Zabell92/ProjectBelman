/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.FileNotFoundException;
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
        System.out.println("Starting UnitTesting\n");
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
        
        System.out.println("Showing test for: showall");
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
     * Test of getTime method, of class ProductionOrderManager.
     */
    @Test
    public void testGetTime() throws Exception
    {
        System.out.println("Show test for: getTime");
        int ID = 123;
        ProductionOrderManager instance = new ProductionOrderManager();
        int expResult = 20;
        int result = instance.getTime(ID);
        assertEquals(expResult, result);
        System.out.println("Expected result: " + expResult);
        System.out.println("Actual result: " + result);

    }
}