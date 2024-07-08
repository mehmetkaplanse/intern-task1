package org.example;

public class Item {
    private String productName;
    private String supplier;
    private double salePrice;
    private double purchasePrice;

    public Item(String productName, String supplier, double salePrice, double purchasePrice) {
        this.productName = productName;
        this.supplier = supplier;
        this.salePrice = salePrice;
        this.purchasePrice = purchasePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void increaseSalePriceBy20Percent() {
        this.salePrice *= 1.20;
    }

    public double calculateProfit() {
        return this.salePrice - this.purchasePrice;
    }
}
