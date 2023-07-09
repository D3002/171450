/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.UserDetails;
import model.Users;

/**
 *
 * @author admin
 */
public class UserDetailDAO extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;
    private List<UserDetails> list;

    public UserDetailDAO() {
    }
    
    public List<UserDetails> getAll() {
        list = new ArrayList<>();
        try {
            String query = "SELECT * FROM UserDetails";
            stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            Users user;
            UserDAO ud = new UserDAO();
            while (rs.next()) {
                user = ud.getUserById(rs.getString("UserID"));
                UserDetails u = new UserDetails(
                        user,
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address")
                );
                list.add(u);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public UserDetails getUserDetail(Users user) {
        UserDetails ud;
        try {
            String query = "SELECT * FROM UserDetails WHERE UserID = ?";
            stm = connection.prepareStatement(query);
            stm.setString(1, String.valueOf(user.getUserID()));
            rs = stm.executeQuery();
            while (rs.next()) {
                UserDetails u = new UserDetails(
                        user,
                        rs.getString("FullName"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address")
                );
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public UserDetails getById(String UserID) {
        UserDAO dao = new UserDAO();
        try {
            String query = "select * from UserDetails where UserID = ?";
            stm = connection.prepareStatement(query);
            stm.setString(1, UserID);
            rs = stm.executeQuery();

            while (rs.next()) {
                return new UserDetails(dao.getUserById(rs.getString("UserID")),
                        rs.getString("Fullname"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"));
            }
        } catch (Exception e) {
        }
        return null;
    } 
    
    public void updateUserDetail(int userID, String Fullname, String Email, String Phone, String Address ) {
        String query = "update userdetails set Fullname = ?, Email = ?, Phone = ?, Address = ? where UserID = ?";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, Fullname);
            stm.setString(2, Email);
            stm.setString(3, Phone);
            stm.setString(4, Address);
            stm.setInt(5, userID);
            stm.execute();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        UserDetailDAO dao = new UserDetailDAO();
        UserDetails user= dao.getById("14");
        System.out.println(user.getUserID());
    }

}