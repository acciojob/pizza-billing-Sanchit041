package com.driver;

import java.awt.*;
import java.util.Stack;

public class Pizza {

    private int countc=-1;
    private int counta =-1;
    private int countb=-1;
    private int price;
    private Boolean isVeg;
    private String bill;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       if(isVeg)
       {
           price = 300;
           System.out.println("Base Price Of The Pizza: 300");
       }
       else
       {
           price = 400;
           System.out.println("Base Price Of The Pizza: 400");
       }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(counta==-1) {
            price += 80;
            System.out.println("Extra Cheese Added: 80");
            counta=0;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(countb==-1) {
            if (isVeg) {
                price += 70;
                System.out.println("Extra Toppings Added: 70");
            } else {
                price += 120;
                System.out.println("Extra Toppings Added: 120");
            }
            countb=0;
        }
    }

    public void addTakeaway(){
        // your code goes here

        if(countc==-1) {

            price += 20;
            System.out.println("Paperbag Added: 20");
            countc=0;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = "Total Price: "+String.valueOf(price);
//        System.out.println("Total Price: " +this.bill);
        return this.bill;
    }
}
