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
import model.OrderDetails;
import model.OrderList;
import model.Orders;
import model.UserDetails;

/**
 *
 * @author admin
 */
public class AdminDAO extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;
    

    public void deleteProduct(String motorBikeID) {
        String query = "delete from MotorBike where motorBikeID = ? ";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, motorBikeID);
            stm.executeUpdate();
        } catch (Exception e) {

        }
    }
    
    public void deleteUser(String userID) {
        String query = "delete from Users where UserID = ? ";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, userID);
            stm.executeUpdate();
        } catch (Exception e) {

        }
    }

    public void addNewProduct(String motorName, String manuID, String price, String stock, String img, String detail) {
        String query = "INSERT INTO MotorBike(MotorName, ManufacturerID, Price, Stock, Details, pic) VALUES (?,?,?,?,?,?)";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, motorName);
            stm.setString(2, manuID);
            stm.setString(3, price);
            stm.setString(4, stock);
            stm.setString(5, img);
            stm.setString(6, detail);
            stm.executeUpdate();
        } catch (Exception e) {

        }
    }

   public void updateProduct(String motorName, String manuID, String price, String stock, String img, String detail, String motorID) {
        String query = "update MotorBike set MotorName = ?,ManufacturerID = ?,Price = ?,Stock = ?,Details = ?,pic = ? where MotorBikeID = ?";
        try {
            stm = connection.prepareStatement(query);
            stm.setString(1, motorName);
            stm.setInt(2, Integer.valueOf(manuID));
            stm.setInt(3, Integer.valueOf(price));
            stm.setInt(4, Integer.valueOf(stock));
            stm.setString(5, detail);
            stm.setString(6, img);
            stm.setInt(7, Integer.valueOf(motorID));
            stm.execute();
        } catch (Exception e) {
        }
    }
    
    public void updateAcc(String username, String password, String isAdmin, String userID){
        String query ="update Users set Username = ?, Password = ?, IsAdmin = ? where UserID = ?";
        try{
            stm = connection.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setInt(3, Integer.valueOf(isAdmin));
            stm.setInt(4, Integer.valueOf(userID));
            stm.execute();
        }catch(Exception e){
            
        }
    }

    public List<Orders> getAllOrder() {
        PreparedStatement stm;
        ResultSet rs;
        List<Orders> list;
        list = new ArrayList<>();
        UserDAO dao = new UserDAO();
        OrderDAO DAO = new OrderDAO();
        try {
            String query = "SELECT * FROM Orders";
            stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                Orders or = new Orders(
                        rs.getInt("OrderID"),
                        dao.getUserById(String.valueOf(rs.getInt("UserID"))),
                        rs.getString("OrderDate"),
                        rs.getInt("TotalPrice"),
                        DAO.getStatusById(rs.getInt("StatusID"))
                );
                list.add(or);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<OrderDetails> getAllOrderDetails() {
        PreparedStatement stm;
        ResultSet rs;
        List<OrderDetails> listor = new ArrayList<>();
        UserDAO dao = new UserDAO();
        OrderDAO DAO = new OrderDAO();
        UserDetailDAO dao1 = new UserDetailDAO();
        MotorDAO dao2 = new MotorDAO();
        try {
            String query = "select * from orderDetails";
            stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                OrderDetails ob = new OrderDetails(
                        rs.getInt("orderDetailID"),
                        DAO.getOrderById(rs.getInt("orderID")),
                        dao2.getById(rs.getString("motorBikeID")),
                        rs.getInt("totalPrice"),
                        rs.getInt("quantity")
                );
                listor.add(ob);
            }
        } catch (Exception e) {
        }
        return listor;
    }

    public static void main(String[] args) {
        AdminDAO dao = new AdminDAO();
        dao.updateAcc("dungbn","dung", "0", "15");
    }

}
