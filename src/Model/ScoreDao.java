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
public class ScoreDao {
    public boolean addScore(Score s) throws Exception {
        String sql = "insert into Scores(id,fullname,Toan,Van,Anh,Ly,Hoa,Sinh,Dia,Su,QP,Tin,GDCD,The)"
                + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try (
            Connection con = DatabaseUtils.openConnection();  
                PreparedStatement pstmt = con.prepareStatement(sql);) {
           pstmt.setString(1, s.getId());
           pstmt.setString(2, s.getFullname());
           pstmt.setFloat(3, s.getToan());
           pstmt.setFloat(4, s.getVan());
           pstmt.setFloat(5, s.getAnh());
           pstmt.setFloat(6, s.getLy());
           pstmt.setFloat(7, s.getHoa());
           pstmt.setFloat(8, s.getSinh());
           pstmt.setFloat(9, s.getDia());
           pstmt.setFloat(10, s.getSu());
           pstmt.setFloat(11, s.getQuocphong());
           pstmt.setFloat(12, s.getTin());
           pstmt.setFloat(13, s.getGdcd());
           pstmt.setFloat(14, s.getThechat());
            return pstmt.executeUpdate() > 0;
        }
    }
    public boolean updateScore(Score s) throws Exception {
        String sql = "update Scores set fullname = ?, Toan = ?, Van = ?, Anh = ?, Ly = ?, Hoa = ?, Sinh = ?,Dia = ?, Su= ?, QP = ?, Tin = ?, GDCD = ?, The = ? where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(14, s.getId());
            pstmt.setString(1, s.getFullname());
           pstmt.setFloat(2, s.getToan());
           pstmt.setFloat(3, s.getVan());
           pstmt.setFloat(4, s.getAnh());
           pstmt.setFloat(5, s.getLy());
           pstmt.setFloat(6, s.getHoa());
           pstmt.setFloat(7, s.getSinh());
           pstmt.setFloat(8, s.getDia());
           pstmt.setFloat(9, s.getSu());
           pstmt.setFloat(10, s.getQuocphong());
           pstmt.setFloat(11, s.getTin());
           pstmt.setFloat(12, s.getGdcd());
           pstmt.setFloat(13, s.getThechat());
            return pstmt.executeUpdate() > 0;
        }
    }
     public boolean deleteScore(String id) throws Exception {
        String sql = "delete from Scores where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, id);
           
            return pstmt.executeUpdate() > 0;
        }
    }
      public Score findByID(String id) throws Exception {
        String sql = "select * from Scores where id = ?";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Score score = new Score();
                score.setId(rs.getString("ID"));
                score.setFullname(rs.getString("FullName"));
                score.setToan(rs.getFloat("Toan"));
                score.setVan(rs.getFloat("Van"));
                score.setAnh(rs.getFloat("Anh"));
                score.setLy(rs.getFloat("Ly"));
                score.setHoa(rs.getFloat("Hoa"));
                score.setSinh(rs.getFloat("Sinh"));
                score.setDia(rs.getFloat("Dia"));
                score.setSu(rs.getFloat("Su"));
                score.setQuocphong(rs.getFloat("QP"));
                score.setTin(rs.getFloat("Tin"));
                score.setGdcd(rs.getFloat("GDCD"));
                score.setThechat(rs.getFloat("The"));
                
                return score;
            }
            return null;
        }
      }
     public List<Score> findScore() throws Exception {
        String sql = "select * from Scores";
                      

        try (
            Connection con = DatabaseUtils.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
          
            ResultSet rs = pstmt.executeQuery();
            List<Score> list = new ArrayList<>();
            while(rs.next()){
                Score score = new Score();
                score.setId(rs.getString("ID"));
                score.setFullname(rs.getString("FullName"));
                score.setToan(rs.getFloat("Toan"));
                score.setVan(rs.getFloat("Van"));
                score.setAnh(rs.getFloat("Anh"));
                score.setLy(rs.getFloat("Ly"));
                score.setHoa(rs.getFloat("Hoa"));
                score.setSinh(rs.getFloat("Sinh"));
                score.setDia(rs.getFloat("Dia"));
                score.setSu(rs.getFloat("Su"));
                score.setQuocphong(rs.getFloat("QP"));
                score.setTin(rs.getFloat("Tin"));
                score.setGdcd(rs.getFloat("GDCD"));
                score.setThechat(rs.getFloat("The"));
                
                
               list.add(score);
            }
            return list;
        }
    }
}
