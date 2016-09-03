/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.productOrder.util;

import java.util.Scanner;

/**
 *
 * @author Sushant
 */
public class ProductOrder {
    Scanner input = new Scanner(System.in);
          
    private String customerName;
    private String [] productName = new String [3];
    private Double [] quantity = new Double[productName.length], unitPrice = new Double[productName.length],
                      totalPrice = new Double[productName.length];
    private double total;
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setProductName(){
        System.out.print("Enter the products name: ");
        for (int i = 0; i < productName.length; i++) {
            productName[i] = input.next();
        }
    }
    
    public void setQuantity(){
        System.out.println("Enter the product quantity");
        for (int i = 0; i < productName.length; i++) {
            System.out.print(productName[i] + " : ");
            quantity[i] = input.nextDouble();
        }
    }
    
    public void setUnitPrice(){
        System.out.println("Enter the unit price of the product : ");
        for (int i = 0; i < productName.length; i++) {
            System.out.print(productName[i] + " : ");
            unitPrice[i] = input.nextDouble();
        }
    }
    
    public void setTotalPrice(){
        for (int i = 0; i < productName.length; i++) {
            totalPrice[i] = quantity[i] * unitPrice[i];
            total += totalPrice[i];
        }
    }
    
    public void display(){
        System.out.println("********* The bill *********");
        System.out.println("    Product Name    " + "    Quantity    " + "    Unit Price    " + "    Total Price    ");
        for (int i = 0; i < productName.length; i++) {
            System.out.println("    " +productName[i] + "      " + quantity[i] + "      " + unitPrice[i] + "      " + totalPrice[i]);
        }
        System.out.println("The total of customer " + customerName + " is " + total);
    }
}
