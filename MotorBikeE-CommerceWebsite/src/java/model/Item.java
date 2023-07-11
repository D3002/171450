/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Item {
    private MotorBike motorbike;
    private int quantity;
    private int price;


    public Item() {
    }

    public Item(MotorBike motorbike, int quantity, int price) {
        this.motorbike = motorbike;
        this.quantity = quantity;
        this.price = price;
    }

    public MotorBike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(MotorBike motorbike) {
        this.motorbike = motorbike;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    
}
