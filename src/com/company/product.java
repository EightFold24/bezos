package com.company;

public class product {
    private int prodNo;
    private String desc;
    private float price;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString()
    {
        return String.format("Product %d\n Description: %s \n price: £%.2f",
                this.getProdNo(), this.getDesc(), this.getPrice());
    }
}
