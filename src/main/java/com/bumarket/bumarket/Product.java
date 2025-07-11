package com.bumarket.bumarket;

import java.text.DecimalFormat;

/**
 *
 * @author pongs
 */
public class Product implements java.io.Serializable {
    
    private String product;
    private int qty;
    private double total;
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

    /**
     * @param productID the productID to set
     */

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
    
  
    public Product(String product, int qty,double price, double total){
        this.product = product;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }
    
    public Object[] toTableRow(int rowNum){
        DecimalFormat df = new DecimalFormat("###0.##");
        return new Object[]{this, df.format(rowNum), product, df.format(qty), "THB "+df.format(price),"THB"+df.format(total)};
    }

}