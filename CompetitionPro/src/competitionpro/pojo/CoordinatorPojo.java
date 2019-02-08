/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.pojo;

/**
 *
 * @author Rahul
 */
public class CoordinatorPojo {
    private String coName;
    private String coEnroll;
    private String coSem;
    private String coBranch;
    private String coCollege;
    private long   coMobile;
    private String compId;

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCoEnroll() {
        return coEnroll;
    }

    public void setCoEnroll(String coEnroll) {
        this.coEnroll = coEnroll;
    }

    public String getCoSem() {
        return coSem;
    }

    public void setCoSem(String coSem) {
        this.coSem = coSem;
    }

    public String getCoBranch() {
        return coBranch;
    }

    public void setCoBranch(String coBranch) {
        this.coBranch = coBranch;
    }

    public String getCoCollege() {
        return coCollege;
    }

    
    public void setCoCollege(String coCollege) {
        this.coCollege = coCollege;
    }

    public long getCoMobile() {
        return coMobile;
    }

    public void setCoMobile(long coMobile) {
        this.coMobile = coMobile;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }
    public CoordinatorPojo(String coName, String coEnroll, String coSem, String coBranch, String coCollege, long coMobile, String compId) {
        this.coName = coName;
        this.coEnroll = coEnroll;
        this.coSem = coSem;
        this.coBranch = coBranch;
        this.coCollege = coCollege;
        this.coMobile = coMobile;
        this.compId = compId;
    }

    public CoordinatorPojo() {
    }
    
    
}
