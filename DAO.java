/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectsql;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Thuy Linh
 */
public class DAO {

    private Connection conn;

    public DAO() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=QLHS";
            conn = DriverManager.getConnection(url, "sa", "sa");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean addStudent(HocSinh s) {
        try {
            String sql = "INSERT INTO tblSV VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getID());
            ps.setString(2, s.getName());
            ps.setString(3, s.getHocLuc());
            ps.setFloat(4, s.getMark());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
        }
        return false;
    }

    public ArrayList<HocSinh> getlstHS() {
        ArrayList<HocSinh> list = new ArrayList<>();
        String sql = "SELECT * FROM tblSV";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HocSinh hs = new HocSinh();
                hs.setID(rs.getString(1));
                hs.setName(rs.getString(2));
                hs.setHocLuc(rs.getString(3));
                hs.setMark(rs.getFloat(4));

                list.add(hs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
