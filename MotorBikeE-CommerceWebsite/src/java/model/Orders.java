/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.AdminDAO;
import java.util.List;

/**
 *
 * @author admin
 */
public class Orders {
    private int orderID;
    private Users userID;
    private String orderDate;
    private int totalPrice;
    private OrderStatus statusID;
    private List<OrderDetails> odList;
    
    public Orders() {
    }

    public Orders(int orderID, Users userID, String orderDate, int totalPrice, OrderStatus statusID) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.statusID = statusID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Users getUserID() {
        return userID;
    }

    public void setUserID(Users userID) {
        this.userID = userID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderStatus getStatusID() {
        return statusID;
    }

    public void setStatusID(OrderStatus statusID) {
        this.statusID = statusID;
    }

    /*public List<OrderDetails> getOdList() {
        return new AdminDAO().getOrderDetails(this.orderID + "");
    }*/

    public void setOdList(List<OrderDetails> odList) {
        this.odList = odList;
    }

    
    
}
