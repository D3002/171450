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
    private Manufacture manufactureID;
    private int price;
    private int stock;
    private String details;
    private String pic;

    public MotorBike(int motorBikeID, String motorName, Manufacture manufactureID, int price, int stock, String details, String pic) {
        this.motorBikeID = motorBikeID;
        this.motorName = motorName;
        this.manufactureID = manufactureID;
        this.price = price;
        this.stock = stock;
        this.details = details;
        this.pic = pic;
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

    public Manufacture getManufactureID() {
        return manufactureID;
    }

    public void setManufactureID(Manufacture manufactureID) {
        this.manufactureID = manufactureID;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
   
    
}
