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
 * @author Aka
 */
public class SimilarOrdersDBM
{

    private SQLServerDataSource dataSource;

    public SimilarOrdersDBM() throws Exception
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

    public ArrayList<ProductionOrder> getSimilarOrders(double Width) throws SQLServerException, SQLException
    {
        try (Connection con = dataSource.getConnection())
        {
            String sql = "SELECT * FROM ProductionOrder WHERE Width <= ? ORDER BY DueDate";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, Width);

            ResultSet rs = ps.executeQuery();

            ArrayList<ProductionOrder> POrder = new ArrayList<>();

            while (rs.next())
            {
                int id = rs.getInt("ID");
                int EmployeeID = rs.getInt("EmployeeID");
                String Porder = rs.getString("POrder");
                Date DueDate = rs.getDate("DueDate");
                int Quantity = rs.getInt("Quantity");
                double width = rs.getDouble("Width");
                int SleeveID = rs.getInt("SleeveID");


                ProductionOrder po = new ProductionOrder(id, EmployeeID, Porder, DueDate, Quantity, width, SleeveID);
                POrder.add(po);
            }
            return POrder;

        }

    }
}
