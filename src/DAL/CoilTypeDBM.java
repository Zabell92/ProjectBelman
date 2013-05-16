/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.CoilType;
import BE.Material;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author MikeZJ
 */
public class CoilTypeDBM
{

    private SQLServerDataSource dataSource;

    public CoilTypeDBM() throws Exception
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

    public ArrayList<CoilType> getByCoilTypeID(int ID, double Width) throws Exception
    {
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM CoilType WHERE MaterialID = ? AND Width >= ? ORDER BY Width";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.setDouble(2, Width);

            ResultSet rs = ps.executeQuery();

            ArrayList<CoilType> CoilType = new ArrayList<>();
            while (rs.next())
            {
                int id = rs.getInt("ID");
                int MaterialID = rs.getInt("MaterialID");
                double width = rs.getDouble("Width");
                double Thickness = rs.getDouble("Thickness");
                String Code = rs.getString("Code");
                
                CoilType ct = new CoilType(id, MaterialID, width, Thickness, Code);
                CoilType.add(ct);
            }
            return CoilType;
        }
    }
}
