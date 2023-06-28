/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

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
    PreparedStatement stm;
    ResultSet rs;
    
    public List<Users> getAll(){
        List<Users> ls=new ArrayList();
        String query = "select * from Users";
        try{
            stm=connection.prepareStatement(query);
            rs=stm.executeQuery(query);
            while(rs.next()){
                ls.add(new Users(
                        rs.getInt("UserID"),
                        rs.getString("Username"),
                        rs.getString("password"),
                        rs.getInt("isAdmin")
                ));
            }
        }catch(Exception e){
            
        }
        return ls;
    }
    
    public Users getUserByName(String username, String password){
        String query = "select* from Users where Username = ? and password = ?";
        try{
            stm=connection.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            rs=stm.executeQuery(query);
            while(rs.next()){
                return new Users(
                        rs.getInt("UserID"),
                        rs.getString("Username"),
                        rs.getString("password"),
                        rs.getInt("isAdmin")
                );
            }
        }catch(Exception e){
            
        }
        return null;
    } 
    
}

