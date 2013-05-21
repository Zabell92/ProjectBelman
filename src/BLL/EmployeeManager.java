/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BE.Employee;
import DAL.EmployeeDBM;
import java.util.ArrayList;

/**
 *
 * @author MikeZJ
 */
public class EmployeeManager
{
  private EmployeeDBM edb;

    public EmployeeManager() throws Exception
    {
        this.edb = new EmployeeDBM();
    }
    
   public ArrayList<Employee> getByEmployeeID(int ID) throws Exception
    {
        return edb.getByEmployeeID(ID);
        
    }  
    
}
