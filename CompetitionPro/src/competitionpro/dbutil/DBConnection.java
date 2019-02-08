
package competitionpro.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static
    {
         try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Successfully Loaded");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-OHK93VE:1521/xe","pro","pro");
            
            JOptionPane.showMessageDialog(null,"Connected Successfully");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Can not Connect to the DataBase"+e);
           
        }
    }
     public static Connection getConnection()
     {
         return conn;
     }
     public static void closeConnection()
     {
         try
         {
             conn.close();
              JOptionPane.showMessageDialog(null,"Disconnected Successfully");
         }
         catch(Exception ex)
         {
             ex.printStackTrace();
             JOptionPane.showMessageDialog(null,"Exception in Closing Connection in DBConnection");
         }
     }
}
