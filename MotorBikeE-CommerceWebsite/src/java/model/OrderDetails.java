/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class OrderDetails {
    private int orderDetailID;
    private Orders orderID;
    private MotorBike motorBikeID;
    private int totalPrice;
    private int quantity;

    public OrderDetails(int orderDetailID, Orders orderID, MotorBike motorBikeID, int totalPrice, int quantity) {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.motorBikeID = motorBikeID;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }

    public int getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public Orders getOrderID() {
        return orderID;
    }

    public void setOrderID(Orders orderID) {
        this.orderID = orderID;
    }

    public MotorBike getMotorBikeID() {
        return motorBikeID;
    }

    public void setMotorBikeID(MotorBike motorBikeID) {
        this.motorBikeID = motorBikeID;
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
