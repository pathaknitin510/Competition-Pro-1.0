/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionpro.pojo;


public class WinnersPojo {
    private String student_id,comp_id;
    private int rank;

    public WinnersPojo(String student_id, int rank) {
        this.student_id = student_id;
        this.rank = rank;
    }

    public WinnersPojo() {
    }

    public WinnersPojo(String student_id, String comp_id, int rank) {
        this.student_id = student_id;
        this.comp_id = comp_id;
        this.rank = rank;
    }

    public String getComp_id() {
        return comp_id;
    }

    public void setComp_id(String comp_id) {
        this.comp_id = comp_id;
    }
    

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    
}
