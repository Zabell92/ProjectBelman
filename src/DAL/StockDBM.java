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

    public StockItem getByMaterialId(int ID) throws Exception
    {
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM Stock WHERE MaterialID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                int id = rs.getInt("id");
                int MaterialID = rs.getInt("MaterialID");
                double StockQuantity = rs.getDouble("address");
                String Code = rs.getString("code");
                String ChargeNo = rs.getString("ChargeNo");



                StockItem s = new StockItem(id, MaterialID, StockQuantity, Code, ChargeNo);
                return s;
            }
            return null;
        }
    }
}
