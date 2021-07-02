/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsql;

/**
 *
 * @author Thuy Linh
 */
public class HocSinh {
    private String ID , Name , HocLuc ;
    private float mark ;

    public HocSinh() {
    }

    public HocSinh(String ID, String Name, String HocLuc, float mark) {
        this.ID = ID;
        this.Name = Name;
        this.HocLuc = HocLuc;
        this.mark = mark;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getHocLuc() {
        return HocLuc;
    }

    public void setHocLuc(String HocLuc) {
        this.HocLuc = HocLuc;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
    
    
}
