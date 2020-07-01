/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author banhg
 */
public class Student {
    private String id,fullName,address,phoneNum,email;
   
    private boolean gender;

    public Student() {
    }
    
    public Student(String id, String fullName, String address, String phoneNum, String email, Date birthDate, boolean gender) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
        this.gender = gender;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBirthDate(JTextField txtBirthdate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
