/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

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
 * @author Aka
 */
public class MaterialDBM
{
    private SQLServerDataSource dataSource;

    public MaterialDBM() throws Exception
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
    
    public ArrayList<Material> getByMaterialID(int ID) throws Exception
    {
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM Material WHERE ID = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            ArrayList<Material> Material = new ArrayList<>();
            if (rs.next())
            {
                int id = rs.getInt("id");
                String MaterialName = rs.getString("MaterialName");
                double MaterialDensity = rs.getDouble("MaterialDensity");
                



                Material ml = new Material(id, MaterialName, MaterialDensity);
                Material.add(ml);
            }
            return Material;
        }
    }

}
