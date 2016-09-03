/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productOrder;

import com.leapfrog.productOrder.util.ProductOrder;

/**
 *
 * @author Sushant
 */
public class Program {

    public static void main(String[] args) {
        ProductOrder order = new ProductOrder();
        order.setCustomerName("Sushant");
        System.out.println("The customers name is " + order.getCustomerName());
        order.setProductName();
        order.setQuantity();
        order.setUnitPrice();
        order.setTotalPrice();
        order.display();
        
    }
    
}
