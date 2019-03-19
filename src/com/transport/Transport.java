package com.transport;

public abstract class Transport {
    private String name;
    private String size;
    private int price;

    public Transport() {

    }

    public Transport(String name, String size, int price){
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
