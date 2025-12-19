package com.mph.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import com.mph.model.User;
import com.mph.utils.DBConnection;
 
public class UserDao {
 
    // 1️ Register user
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (email, password, name, role) VALUES (?, ?, ?, ?)";
 
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            ps.setString(4, user.getRole());
 
            int rows = ps.executeUpdate();
            return rows > 0;
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return false;
    }
 
    // 2️ Get user by email
    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM users WHERE email = ?";
 
        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {
            ps.setString(1, email);
 
            ResultSet rs = ps.executeQuery();
 
            if (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setRole(rs.getString("role"));
 
                return user;
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return null;
    }
}
