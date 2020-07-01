/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author banhg
 */
public class Score {
    private String id,fullname;
    private float toan,van,anh,ly,hoa,sinh,dia,su,quocphong,tin,gdcd,thechat;

    public Score() {
    }

    
    public Score(String id, String fullname, float toan, float van, float anh, float ly, float hoa, float sinh, float dia, float su, float quocphong, float tin, float gdcd, float thechat) {
        this.id = id;
        this.fullname = fullname;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.dia = dia;
        this.su = su;
        this.quocphong = quocphong;
        this.tin = tin;
        this.gdcd = gdcd;
        this.thechat = thechat;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) {
        this.anh = anh;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getSinh() {
        return sinh;
    }

    public void setSinh(float sinh) {
        this.sinh = sinh;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        this.su = su;
    }

    public float getQuocphong() {
        return quocphong;
    }

    public void setQuocphong(float quocphong) {
        this.quocphong = quocphong;
    }

    public float getTin() {
        return tin;
    }

    public void setTin(float tin) {
        this.tin = tin;
    }

    public float getGdcd() {
        return gdcd;
    }

    public void setGdcd(float gdcd) {
        this.gdcd = gdcd;
    }

    public float getThechat() {
        return thechat;
    }

    public void setThechat(float thechat) {
        this.thechat = thechat;
    }
    
}
