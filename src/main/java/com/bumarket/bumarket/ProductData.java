/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bumarket.bumarket;

/**
 *
 * @author chait
 */
public class ProductData implements java.io.Serializable {
    
    private String Id;
    private String Name;
    private String Quantity;
    private String Price;
    private String Point;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getPoint() {
        return Point;
    }

    public void setPoint(String Point) {
        this.Point = Point;
    }

    
}
