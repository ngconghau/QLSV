/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DB.DatabaseUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author banhg
 */
public class StudentDao {

    public boolean addStudent(Student e) throws Exception {
        String sql = "insert into Students(id,fullname,gender,address,phoneNumber,email)"
                + " values(?,?,?,?,?,?)";

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, e.getId());
            pstmt.setString(2, e.getFullName());
            pstmt.setBoolean(3, e.isGender());
            pstmt.setString(4, e.getAddress());
            pstmt.setString(5, e.getPhoneNum());
            pstmt.setString(6, e.getEmail());
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateStudent(Student e) throws Exception {
        String sql = "update Students set fullname = ?, gender = ?, address = ?, phoneNumber = ?, email = ? where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(6, e.getId());
            pstmt.setString(1, e.getFullName());
            pstmt.setBoolean(2, e.isGender());
            pstmt.setString(3, e.getAddress());
            pstmt.setString(4, e.getPhoneNum());
            pstmt.setString(5, e.getEmail());
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean deleteStudent(String id) throws Exception {
        String sql = "delete from students where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, id);
           
            return pstmt.executeUpdate() > 0;
        }
    }
    
    public Student findStudentByID(String id) throws Exception {
        String sql = "select * from Students where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Student student = new Student();
                student.setId(rs.getString("ID"));
                student.setFullName(rs.getString("FullName"));
                student.setGender(rs.getBoolean("Gender"));
                student.setAddress(rs.getString("Address"));
                student.setPhoneNum(rs.getString("PhoneNumber"));
                student.setEmail(rs.getString("Email"));
                
                return student;
            }
            return null;
        }
    }
     public List<Student> findStudent() throws Exception {
        String sql = "select * from Students";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
          
            ResultSet rs = pstmt.executeQuery();
            List<Student> list = new ArrayList<>();
            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getString("ID"));
                student.setFullName(rs.getString("FullName"));
                student.setGender(rs.getBoolean("Gender"));
                student.setAddress(rs.getString("Address"));
                student.setPhoneNum(rs.getString("PhoneNumber"));
                student.setEmail(rs.getString("Email"));
                
               list.add(student);
            }
            return list;
        }
    }
}
