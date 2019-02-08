/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.dao;

import competitionpro.dbutil.DBConnection;
import competitionpro.pojo.RegisterStudentsPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RegisterStudentsDAO {
    
    public static String getStudentId(String compName) throws SQLException
    {
//        String s=(new CompetitionPojo()).getCompName();
        //System.out.println(compName);
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select count(*) from competition");
        PreparedStatement ps1=conn.prepareStatement("select count(*) from registered_students");
        ResultSet rs=ps.executeQuery();
        ResultSet rs1=ps1.executeQuery();
        int countcomp=0,countstud=0;
        while(rs.next())
            countcomp=rs.getInt(1);
        while(rs1.next())
            countstud=rs1.getInt(1);
        
        
        String s=(compName.substring(0,4)+(countcomp)+"-"+(countstud+1));
        //System.out.println(countcomp+" "+countstud+" "+s);
        return s;
    }
    
    
  public static boolean registerStudent(RegisterStudentsPojo studentPojo) throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("insert into registered_students values(?,?,?,?,?,?,?,?,?,?)");
      ps.setString(1,studentPojo.getName());
      ps.setString(2,studentPojo.getEnroll());
      ps.setString(3,studentPojo.getSem());
      ps.setString(4,studentPojo.getBranch());
      ps.setString(5,studentPojo.getCollege());
      ps.setLong(6,studentPojo.getMobile());
      ps.setString(7,studentPojo.getEmail());
      ps.setString(8,studentPojo.getCompId());
      ps.setString(9,studentPojo.getStudentId());
      ps.setString(10,studentPojo.getAttendanceStatus());
      System.out.println("fvbsgn");
      int count=ps.executeUpdate();
      System.out.println(count);
          
      return (count==1);
  }
//   public static boolean getAllStudents(String CompId) throws SQLException
//   {
//       
//       
//   }

    public static boolean updateAttendence(String studentId) throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update registered_students set attend_status='P' where student_id=?");
        ps.setString(1, studentId);
        int c=ps.executeUpdate();
        return (c==1);
    }
    public static int getTotalStudents(String compId) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select count(*) from registered_students where comp_id=?");
        ps.setString(1, compId);
        ResultSet rs=ps.executeQuery();
        rs.next();
      int totalStudents=rs.getInt(1);
        System.out.println(totalStudents);
      return totalStudents;    
}
    public static ArrayList<String> getAllMails(String compId) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        ArrayList<String> allMails=new ArrayList<>();
        PreparedStatement ps=conn.prepareStatement("select email from registered_students where comp_id=?");
        ps.setString(1, compId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
              allMails.add(rs.getString(1));
        }
        return allMails;
    }
}
