/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class OrderList {

    private int orderDetailID;
    private UserDetails userID;
    private MotorBike motorBikeID;
    private Orders orderID;
    private OrderStatus statusID;
    private int totalPrice;
    private int quantity;
    
    public OrderList(){
    
    }

    public OrderList(int orderDetailID, UserDetails userID, MotorBike motorBikeID, Orders orderID, OrderStatus statusID, int totalPrice, int quantity) {
        this.orderDetailID = orderDetailID;
        this.userID = userID;
        this.motorBikeID = motorBikeID;
        this.orderID = orderID;
        this.statusID = statusID;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public UserDetails getUserID() {
        return userID;
    }

    public void setUserID(UserDetails userID) {
        this.userID = userID;
    }

    public MotorBike getMotorBikeID() {
        return motorBikeID;
    }

    public void setMotorBikeID(MotorBike motorBikeID) {
        this.motorBikeID = motorBikeID;
    }

    public Orders getOrderID() {
        return orderID;
    }

    public void setOrderID(Orders orderID) {
        this.orderID = orderID;
    }

    public OrderStatus getStatusID() {
        return statusID;
    }

    public void setStatusID(OrderStatus statusID) {
        this.statusID = statusID;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
