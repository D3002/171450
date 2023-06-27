/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class MotorBike {
    private int motorBikeID;
    private String motorName;
    private int price;
    private int stock;
    private String details;

    public MotorBike(int motorBikeID, String motorName, int price, int stock, String details) {
        this.motorBikeID = motorBikeID;
        this.motorName = motorName;
        this.price = price;
        this.stock = stock;
        this.details = details;
    }

    public int getMotorBikeID() {
        return motorBikeID;
    }

    public void setMotorBikeID(int motorBikeID) {
        this.motorBikeID = motorBikeID;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
}
