/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Employee;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author MikeZJ
 */
public class EmployeeDBM
{

    private SQLServerDataSource dataSource;

    public EmployeeDBM() throws Exception
    {
        Properties props = new Properties();
        props.load(new FileReader("ConnectionInfo.cfg"));

        dataSource = new SQLServerDataSource();

        dataSource.setServerName(props.getProperty("SERVER"));
        dataSource.setPortNumber(Integer.parseInt(props.getProperty("PORT")));
        dataSource.setDatabaseName(props.getProperty("DATABASE"));
        dataSource.setUser(props.getProperty("USER"));
        dataSource.setPassword(props.getProperty("PASSWORD"));
    }

    public int getByName(String Name) throws Exception
    {
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT ID FROM Employee WHERE Name = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Name);

            ResultSet rs = ps.executeQuery();


            if (rs.next())
            {

                int ID = rs.getInt("ID");

                return ID;



            }
            throw new SQLException("Name not found");
        }
    }

    public ArrayList<Employee> getAllEmployees() throws Exception
    {
        Connection con = dataSource.getConnection();
        String sql = "SELECT * FROM Employee";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList<Employee> Employee = new ArrayList<>();
        while (rs.next())
        {
            int id = rs.getInt("id");
            String Name = rs.getString("Name");


            Employee em = new Employee(id, Name);
            Employee.add(em);
        }
        return Employee;
        //return null;
    }
}
