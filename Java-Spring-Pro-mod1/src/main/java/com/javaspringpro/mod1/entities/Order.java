package com.javaspringpro.mod1.entities;

public class Order {

    private int cod;
    private double basicValue;
    private double discount;

    public Order (){}

    public Order(int cod, double basicValue, double discount) {
        this.cod = cod;
        this.basicValue = basicValue;
        this.discount = discount;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(double basicValue) {
        this.basicValue = basicValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
