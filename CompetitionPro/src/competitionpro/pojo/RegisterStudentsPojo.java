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
public class RegisterStudentsPojo {
    private String name;
    private String enroll;
    private String sem;
    private String branch;
    private String college;
    private long mobile;
    private String email;
    private String compId;
    private String studentId;
    private String attendanceStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public RegisterStudentsPojo(String name, String enroll, String sem, String branch, String college, long mobile, String email, String compId, String studentId, String attendanceStatus) {
        this.name = name;
        this.enroll = enroll;
        this.sem = sem;
        this.branch = branch;
        this.college = college;
        this.mobile = mobile;
        this.email = email;
        this.compId = compId;
        this.studentId = studentId;
        this.attendanceStatus = attendanceStatus;
    }

    public RegisterStudentsPojo() {
    }
    
}
