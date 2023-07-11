/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import model.Cart;
import model.Item;
import model.OrderStatus;
import model.Users;

/**
 *
 * @author admin
 */
public class OrderDAO extends DBContext {

    public void addOrder(Users u, Cart cart, int StatusId) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            //add order
            String query1 = "  insert into Orders(UserID,OrderDate,TotalPrice,StatusID) values(?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(query1);
            st.setInt(1, u.getUserID());
            st.setString(2, date);
            st.setInt(3, cart.getTotalMoney());
            st.setInt(4, StatusId);
            st.executeUpdate();
            //lay id cua order vua add
            String query2 = "select top 1 OrderID from [Orders] order by OrderID desc";
            PreparedStatement st1 = connection.prepareStatement(query2);
            ResultSet rs = st1.executeQuery();
            //add bang OrderDetail
            MotorDAO mb = new MotorDAO();
            if (rs.next()) {
                int oid = rs.getInt("OrderID");
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into OrderDetails(OrderID, MotorBikeID, TotalPrice,Quantity) values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getMotorbike().getMotorBikeID());
                    st2.setInt(3, i.getPrice());
                    st2.setInt(4, i.getQuantity());
                    st2.executeUpdate();

                }
            }

            //cap nhat lai so luong san pham trong bảng product
            String sql3="update MotorBike set Stock=quantity-? where MotorBikeID=?";
            PreparedStatement st3=connection.prepareStatement(sql3);
            for(Item i:cart.getItems()){
                st3.setInt(1, i.getQuantity());
                st3.setInt(2, i.getMotorbike().getMotorBikeID());
                st3.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }
    
    public static void main(String[] args) {
        OrderDAO dao = new OrderDAO();
        MotorDAO mb=new MotorDAO();
        Users u = new UserDAO().getUserById("1");
        Cart c = new Cart();
        Item t = new Item(mb.getById("1"), 1, 10000);
        c.addItem(t);
        dao.addOrder(u, c, 1);
    }
}
