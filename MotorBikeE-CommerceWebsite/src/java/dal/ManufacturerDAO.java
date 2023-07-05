/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import com.sun.corba.se.spi.monitoring.MonitoringConstants;
import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Manufacture;

/**
 *
 * @author admin
 */
public class ManufacturerDAO extends DBContext {

    private PreparedStatement stm;
    private ResultSet rs;
    private List<Manufacture> list;

    public ManufacturerDAO() {
    }

    public Manufacture getManufacturerByID(int id) {
        try {
            String query = "Select * from Manufacturer where ManufacturerID = ?";
            stm = connection.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while(rs.next()){
                return new Manufacture(rs.getInt("ManufactureID"),
                        rs.getString("name"),
                        rs.getString("country"),
                        rs.getString("contact"));
            }
        } catch (Exception e) {

        }
        return null;
    }
}
