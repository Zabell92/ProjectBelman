/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.StockItem;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Aka
 */
public class StockDBM
{

    private SQLServerDataSource dataSource;

    public StockDBM() throws Exception
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

    public ArrayList<StockItem> getBySleeveId(int ID) throws Exception
    {
        {
            Connection con = dataSource.getConnection();

            String sql = "SELECT * FROM Stock WHERE CoilTypeID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();
            ArrayList<StockItem> StockItem = new ArrayList<>();
            while (rs.next())
            {
                int id = rs.getInt("id");

                double StockQuantity = rs.getDouble("StockQuantity");
                double Length = rs.getDouble("Length");
                String ChargeNo = rs.getString("ChargeNo");
                int SleeveID = rs.getInt("SleeveID");
                int CoilTypeID = rs.getInt("CoilTypeID");



                StockItem s = new StockItem(id, StockQuantity, Length, ChargeNo, SleeveID, CoilTypeID);
                StockItem.add(s);
            }
            return StockItem;
        }
    }
}
