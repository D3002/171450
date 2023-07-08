/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import context.DBContext;
import java.math.MathContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.MotorBike;

/**
 *
 * @author admin
 */
public class MotorDAO extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;
    private List<MotorBike> list;
    ManufacturerDAO dao = new ManufacturerDAO();

    public MotorDAO() {
    }

    public List<MotorBike> getAll() {
        list = new ArrayList<>();
        try {
            String query = "SELECT * FROM MotorBike";
            stm = connection.prepareStatement(query);
            rs = stm.executeQuery();
            while (rs.next()) {
                MotorBike mb = new MotorBike(rs.getInt("motorBikeID"),
                        rs.getString("motorName"),
                        dao.getManufacturerByID(rs.getInt("ManufacturerID")),
                        rs.getInt("price"),
                        rs.getInt("stock"),
                        rs.getString("details"),
                        rs.getString("pic"));
                list.add(mb);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public MotorBike getById(String motorBikeID) {
        try {
            String query = "select * from MotorBike where MotorBikeID = ?";
            stm = connection.prepareStatement(query);
            stm.setString(1, motorBikeID);
            rs = stm.executeQuery();

            while (rs.next()) {
                return new MotorBike(rs.getInt("motorBikeID"),
                        rs.getString("motorName"),
                        dao.getManufacturerByID(rs.getInt("ManufacturerID")),
                        rs.getInt("price"),
                        rs.getInt("stock"),
                        rs.getString("details"),
                        rs.getString("pic"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<MotorBike> getByName(String motorName) {
        list = new ArrayList<>();
        try {
            String query = "select * from MotorBike where MotorName like ?";
            stm = connection.prepareStatement(query);
            stm.setString(1,"%" + motorName + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                MotorBike mb = new MotorBike(rs.getInt("motorBikeID"),
                        rs.getString("motorName"),
                        dao.getManufacturerByID(rs.getInt("ManufacturerID")),
                        rs.getInt("price"),
                        rs.getInt("stock"),
                        rs.getString("details"),
                        rs.getString("pic"));
                list.add(mb);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static void main(String[] args) {
        MotorDAO DAO = new MotorDAO();
        List<MotorBike> list = DAO.getAll();
        for (MotorBike motor : list) {
            System.out.println(motor);
        }
    }
}
