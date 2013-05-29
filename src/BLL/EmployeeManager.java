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

    /**
     * Creates a new Employee DBM
     * 
     */
    public EmployeeManager() throws Exception
    {
        this.edb = new EmployeeDBM();
    }

    /**
     *
     * @param Name
     * @return the name specified
     */
    public int getByName(String Name) throws Exception
    {
        return edb.getByName(Name);

    }

    /**
     *
     * @returns all the employees
     * @throws Exception
     */
    public ArrayList<Employee> getAllEmployees() throws Exception
    {

        return edb.getAllEmployees();
    }
}
