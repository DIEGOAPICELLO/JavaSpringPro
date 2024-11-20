package com.javaspringpro.mod1.services;

import com.javaspringpro.mod1.entities.Order;

public class OrderService {

    private final ShippingService shippingService;

    public OrderService (ShippingService shippingService){
        this.shippingService = shippingService;
    }

    public double calculteTotal (Order order) {
        double discount = order.getBasicValue() * (order.getDiscount() / 100);
        double discountedValue = order.getBasicValue() - discount;
        double shipping = shippingService.calculateShipping(order.getBasicValue());
        return discountedValue + shipping;
    }
}
