/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.CoilType;
import java.util.ArrayList;
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
public class CoilTypeManagerTest
{
    
    public CoilTypeManagerTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
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
     * Test of getByCoilTypeID method, of class CoilTypeManager.
     */
    @Test
    public void testGetByCoilTypeID() throws Exception
    {
        System.out.println("getByCoilTypeID");
        int ID = 5;
        double Width = 1500.0;
        int MaterialID = 10;
        String Code = "RP-13/56";
        double Thickness = 3;
                
        CoilTypeManager instance = new CoilTypeManager();
        ArrayList<CoilType> expResult = new ArrayList<>();
      
        expResult.add(new CoilType(ID, MaterialID, Width, Thickness, Code));
        ArrayList<CoilType> result = instance.getByCoilTypeID(ID, Width);
       
        System.out.println("Result : " + result.isEmpty());
        assertEquals( "Failed blabla was: ", expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}