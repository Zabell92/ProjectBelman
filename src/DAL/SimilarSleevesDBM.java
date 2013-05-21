/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BE.Sleeve;
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
public class SimilarSleevesDBM
{
  private SQLServerDataSource dataSource;

    public SimilarSleevesDBM() throws Exception
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
    
    public ArrayList<Sleeve> getNewSimilarSleeve(int ID, double Width, double Thickness) throws Exception
    {
        {
            Connection con = dataSource.getConnection();
            String sql = "SELECT * FROM Sleeve WHERE MaterialID = ? AND Thickness = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            ArrayList<Sleeve> Sleeve = new ArrayList<>();
            while (rs.next())
            {
                int id = rs.getInt("id");
                double thickness = rs.getDouble("Thickness");
                double Circumference = rs.getDouble("Circumference");
                int StartTime = rs.getInt("StartTime");
                int EndTime = rs.getInt("EndTime");
                int MaterialID = rs.getInt("MaterialID");



                Sleeve sl = new Sleeve(id, thickness, Circumference, StartTime, EndTime, MaterialID);
                Sleeve.add(sl);
            }
            return Sleeve;
        }
    }   
}