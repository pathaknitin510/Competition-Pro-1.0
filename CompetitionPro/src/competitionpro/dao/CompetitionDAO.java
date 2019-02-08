/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.dao;

import competitionpro.dbutil.DBConnection;
import competitionpro.pojo.CompetitionPojo;
import competitionpro.pojo.CoordinatorPojo;
import competitionpro.pojo.WinnersPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rahul
 */
public class CompetitionDAO {
    
    public static boolean checkCompMail(String compMail) throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from competition where comp_mail=?");
        ps.setString(1, compMail);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
            return true;
        return false;
    }
    

    public static boolean registerCompetition(CompetitionPojo compPojo) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into competition values(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, compPojo.getCompId());
        ps.setString(2, compPojo.getCompName());
        ps.setString(3, compPojo.getCompMail());
        ps.setString(4, compPojo.getCompPassword());
        ps.setString(5, compPojo.getInchargeName());
        ps.setString(6, compPojo.getInchargeMail());
        ps.setString(7, compPojo.getAmount());
        ps.setString(8, compPojo.getDate());
        ps.setString(9, compPojo.getVenue());
        ps.setString(10, compPojo.getAlternateMail());
        int count=ps.executeUpdate();
        return (count==1);
    }
    
    public static boolean registerCoordinator(CoordinatorPojo coPojo) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into coordinators values(?,?,?,?,?,?,?)");
        ps.setString(1, coPojo.getCoName());
        ps.setString(2, coPojo.getCoEnroll());
        ps.setString(3, coPojo.getCoSem());
        ps.setString(4, coPojo.getCoBranch());
        ps.setString(5, coPojo.getCoCollege());
        ps.setLong(6, coPojo.getCoMobile());
        ps.setString(7, coPojo.getCompId());
        int count=ps.executeUpdate();
        return (count==1);
    }
    public static String getCompetitionId() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        Statement st=conn.createStatement();
        int count=0;
        ResultSet rs=st.executeQuery("select count(*) from competition");
        while(rs.next())
        count=rs.getInt(1);
        
        return "CPID-"+(count+101);
    }
    public static boolean logInCompetition(CompetitionPojo compPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select comp_password from competition where comp_mail=?");
        ps.setString(1,compPojo.getCompMail());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            if(rs.getString(1).equals(compPojo.getCompPassword()))
                return true;
        }
        return false;
    }
    public static boolean forgotCompPassword(CompetitionPojo compPojo) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update competition set comp_password=? where comp_mail=? and incharge_mail=?");
        ps.setString(1,compPojo.getCompPassword());
        ps.setString(2,compPojo.getCompMail());
        ps.setString(3,compPojo.getInchargeMail());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
            return true;
        return false;
    }

    public static CompetitionPojo getCompPojo(String compMail) throws SQLException {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select comp_id,comp_name,comp_date,comp_password,venue,incharge_mail,amount,incharge_name from competition where comp_mail=?");
        CompetitionPojo compPojo=new CompetitionPojo();
        ps.setString(1, compMail);
        ResultSet rs=ps.executeQuery();
        rs.next();
        compPojo.setCompId(rs.getString(1));
        compPojo.setCompName(rs.getString(2));
        compPojo.setDate(rs.getString(3));
        compPojo.setCompPassword(rs.getString(4));
        compPojo.setVenue(rs.getString(5));
        compPojo.setAmount(rs.getString(7));
        compPojo.setInchargeMail(rs.getString(6));
        compPojo.setInchargeName(rs.getString(8));
//        compPojo.setAmount(rs.getString(7))
//        System.out.println("amoount"+rs.getString(7));
        return compPojo;
    }

    public static boolean addWinner(WinnersPojo winnerPojo) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into winners values(?,?,?)");
        ps.setString(1,winnerPojo.getStudent_id());
        ps.setString(2,winnerPojo.getComp_id());
        ps.setInt(3,winnerPojo.getRank());
        int count=ps.executeUpdate();
        return (count==1);
        
    }
    
    
}
