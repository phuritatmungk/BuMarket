/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bumarket.bumarket;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;

/**
 *
 * @author chait
 */
public class ProductData implements java.io.Serializable {
    
    private String product;
    private int productID;
    private int qty;
    private double total;
    private int point;
    private double price;
    private List<List<String>> productdataList2 = new ArrayList<>();
    
    public void list_product (String id ,String products ,String quantity , String prices ,String totals, String points ){
        String ID = Integer.toString(productID);
        String Qty = Integer.toString(qty);
        String Prices = Double.toString(price);
        String Total = Double.toString(total);
        String Point = Integer.toString(point);
        
        ID = id;
        product = products;
        Qty = quantity;
        Prices = prices;
        Total = totals;
        Point = points;
        
        //List<String> productdataList1 = new ArrayList<>();
        //productdataList1.add(ID);
        //productdataList1.add( product);
        //productdataList1.add(Qty);
        //productdataList1.add(Prices);
        //productdataList1.add(Total);
        //productdataList1.add(Point);
        
        //List<List<String>> productdataList2 = new ArrayList<>();
        //productdataList2.add(productdataList1);
        //System.out.println(productdataList2);
        
        List<String> productdataList1 = new ArrayList<>();
        productdataList1.add(ID);
        productdataList1.add(product);
        productdataList1.add(Qty);
        productdataList1.add(Prices);
        productdataList1.add(Total);
        productdataList1.add(Point);

        productdataList2.add(new ArrayList<>(productdataList1));

        System.out.println(productdataList2);
         
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the product
     */
    
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the productID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * @param productID the productID to set
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the point
     */
    public int getPoint() {
        return point;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(int point) {
        this.point = point;
    }

    void setQty(JSpinner jSpinner1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
