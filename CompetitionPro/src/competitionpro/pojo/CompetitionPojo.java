/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.pojo;

import java.sql.Date;

/**
 *
 * @author Rahul
 */
public class CompetitionPojo {
    private String compId;
    private String compName;
    private String compMail;
    private String compPassword;
    private String inchargeName;
    private String inchargeMail;
    private String amount;
    private String date;
    private String venue;
    private String alternateMail;
    private String confPassword;

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }
    
    

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompMail() {
        return compMail;
    }

    public void setCompMail(String compMail) {
        this.compMail = compMail;
    }

    public String getCompPassword() {
        return compPassword;
    }

    public void setCompPassword(String compPassword) {
        this.compPassword = compPassword;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public String getInchargeMail() {
        return inchargeMail;
    }

    public void setInchargeMail(String inchargeMail) {
        this.inchargeMail = inchargeMail;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getAlternateMail() {
        return alternateMail;
    }

    public void setAlternateMail(String alternateMail) {
        this.alternateMail = alternateMail;
    }
    
    

    public CompetitionPojo(String compId, String compName, String compMail, String compPassword, String inchargeName, String inchargeMail, String amount, String date, String venue,String alternateEmail) {
        this.compId = compId;
        this.compName = compName;
        this.compMail = compMail;
        this.compPassword = compPassword;
        this.inchargeName = inchargeName;
        this.inchargeMail = inchargeMail;
        this.amount = amount;
        this.date = date;
        this.venue = venue;
        this.alternateMail=alternateMail;
    }

    public CompetitionPojo() {
    }

    
    
    
}