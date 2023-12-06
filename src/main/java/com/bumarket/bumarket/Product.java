package com.bumarket.bumarket;

import java.text.DecimalFormat;

/**
 *
 * @author pongs
 */
public class Product implements java.io.Serializable {
    
    private String product;
    private int productID;
    private int qty;
    private double total;
    private int point;
    private double price;

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
    
    public Product(String product, int productID, int qty,double price, double total, int point){
        this.product = product;
        this.productID = productID;
        this.qty = qty;
        this.price = price;
        this.total = total;
        this.point = point;
    }
    
    public Object[] toTableRow(int rowNum){
        DecimalFormat df = new DecimalFormat("###0.##");
        return new Object[]{this, df.format(productID), product, df.format(qty), "$"+df.format(price),"$"+df.format(total), df.format(point)};
    }
    
}