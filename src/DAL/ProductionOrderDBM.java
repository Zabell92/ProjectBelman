/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.ProductionOrder;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author MikeZJ
 */
public class ProductionOrderDBM
{

    private SQLServerDataSource dataSource;

    public ProductionOrderDBM() throws Exception
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

    public ArrayList<ProductionOrder> showAll() throws SQLServerException, SQLException
    {
        try (Connection con = dataSource.getConnection())
        {
            String sql = "SELECT * FROM ProductionOrder ORDER BY DueDate";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            ArrayList<ProductionOrder> POrder = new ArrayList<>();

            while (rs.next())
            {
                int id = rs.getInt("ID");
                int EmployeeID = rs.getInt("EmployeeID");
                String Porder = rs.getString("POrder");
                Date DueDate = rs.getDate("DueDate");
                int Quantity = rs.getInt("Quantity");
                double Width = rs.getDouble("Width");
                int SleeveID = rs.getInt("SleeveID");
                boolean IsDone = rs.getBoolean("IsDone");
                int TimeUsed = rs.getInt("TimeUsed");


                ProductionOrder po = new ProductionOrder(id, EmployeeID, Porder,
                        DueDate, Quantity, Width, SleeveID, IsDone, TimeUsed);
                POrder.add(po);
            }
            return POrder;

        }
    }

    public void insertTime(long TimeUsed, int ID) throws SQLException
    {
        try (Connection con = dataSource.getConnection())
        {
            String sql = "UPDATE ProductionOrder SET TimeUsed = ? Where ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setLong(1, TimeUsed);
            ps.setInt(2, ID);


            int affectedRows = ps.executeUpdate();

            while (affectedRows == 0)
            {
                throw new SQLException("Unable to insert time");
            }
//          

        }

    }

    public void updateIsDone(int ID) throws SQLException
    {
        Connection con = dataSource.getConnection();

        String sql = "UPDATE ProductionOrder SET IsDone = 1 WHERE ID = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to update isDone");
        }
    }

    public void updateEmployee(int ID, String Name) throws SQLException
    {
        Connection con = dataSource.getConnection();

        String sql = "Update ProductionOrder SET EmployeeID = ? WHERE Name = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, ID);
        ps.setString(2, Name);

        int affectedRows = ps.executeUpdate();
        if (affectedRows == 0)
        {
            throw new SQLException("Unable to update isDone");
        }
    }
}
