package com.kodilla.good.patterns.food2door;

public class Product {

    private String productName;
    private String supplierName;
    private int quantity;

    public Product (final String productName,
                    final String supplierName,
                    final int quantity){
        this.productName = productName;
        this.supplierName = supplierName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getQuantity() {
        return quantity;
    }
}
