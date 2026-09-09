/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priceof50mangoes;

import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class Priceof50mangoes {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try{
        double price , product , tprice;
        
        
        System.out.println("Enter price of one mango:");
        price = input.nextDouble();
        
        product = price * 50;
        tprice = product;
        
        System.out.println("total price="+tprice);
        }catch(Exception e){
               System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
    }
}
}