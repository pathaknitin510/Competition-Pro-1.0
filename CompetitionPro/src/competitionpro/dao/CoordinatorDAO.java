/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.dao;

import competitionpro.dbutil.DBConnection;
import competitionpro.pojo.CoordinatorPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CoordinatorDAO {
    
  public static ArrayList<Long> getCoordinatorPojo(String compId) throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select mobile  from coordinators where comp_id=?");
      ArrayList<Long> coMobileNo=new ArrayList<>();
        ps.setString(1, compId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        coMobileNo.add(rs.getLong(1));
        
        return coMobileNo;
  }
}
