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

    public int getByName(String Name) throws Exception
    {
        return edb.getByName(Name);

    }

    public ArrayList<Employee> getAllEmployees() throws Exception
    {

        return edb.getAllEmployees();
    }
}
