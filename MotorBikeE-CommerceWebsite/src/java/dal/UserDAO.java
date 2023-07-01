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
import model.Users;

/**
 *
 * @author admin
 */
public class UserDAO extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;
    private List<Users> list;

    public UserDAO() {
    }

    public List<Users> getAll() {
        list = new ArrayList<>();
        try {
            String query = "SELECT * FROM Users";
            stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                Users u = new Users(
                        rs.getInt("UserID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getInt("IsAdmin")
                );
                list.add(u);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Users loginByUsername(String username, String password) {
        String query = "select * from Users u where username = ? and password = ?";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            rs = stm.executeQuery();
            while (rs.next()) {
                Users u = new Users(
                        rs.getInt("UserID"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getInt("IsAdmin")
                );
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Users checkExist(String username) {
        String query = "select* from Users where Username = ?";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, username);

            rs = stm.executeQuery();
        } catch (Exception e) {

        }
        return null;
    }

    public void signUp(String username, String password) {
        String query = "insert into Users(Username, [Password], IsAdmin)  value(?,?,0)";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.executeUpdate();
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        List<Users> list = dao.getAll();
        for (Users users : list) {
            System.out.println(users);
        }
    }

}
