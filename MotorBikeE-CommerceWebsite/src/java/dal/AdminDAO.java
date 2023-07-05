/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
