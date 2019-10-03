package com.company;

public class product {
    private int prodNo;
    private String desc;
    private double price;

    public product(int newProdNo, double newPrice, String newDesc){
        this(newProdNo, newPrice);
        setDesc(newDesc);
    }

    public product(int newProdNo)
    {
        setProdNo(newProdNo);
    }

    public product(int newProdNo, double newPrice){
        this(newProdNo);
        setPrice(newPrice);
    }

    public int getProdNo() {
        return prodNo;
    }

    public void setProdNo(int prodNo) {
        this.prodNo = prodNo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return String.format("Product %d\n Description: %s \n price: £%.2f",
                this.getProdNo(), this.getDesc(), this.getPrice());
    }
}
