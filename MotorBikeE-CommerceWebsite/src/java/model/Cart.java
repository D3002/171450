/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.MotorDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Cart {

    private List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getQuantityById(int id) {
        return getItemById(id).getQuantity();
    }

    private Item getItemById(int id) {
        for (Item i : items) {
            if (i.getMotorbike().getMotorBikeID() == id ) {
                return i;
            }
        }
        return null;
    }
    public int getNumberItemByPid(int pid) {
        int count =0;
        for (Item i : items) {
            if (i.getMotorbike().getMotorBikeID() == pid) {
                count += i.getQuantity();
            }
        }
        return count;
    }

    public void addItem(Item t) {
        int id = t.getMotorbike().getMotorBikeID();
        if (getItemById(id) != null) {
            Item m = getItemById(id);
            m.setQuantity(m.getQuantity() + t.getQuantity());
        } else {
            items.add(t);
        }
    }

    public void removeItem(int id) {
        if (getItemById(id) != null) {
            items.remove(getItemById(id));
        }
    }

    public int getTotalMoney() {
        int t = 0;
        for (Item i : items) {
            t += i.getQuantity()* i.getPrice();
        }
        return t;
    }

    public static void main(String[] args) {
        MotorDAO d = new MotorDAO();
        Cart c = new Cart();
        c.addItem(new Item(d.getByIdInt(1), 2, 2));
        System.out.println(c.items);

    }
    

}