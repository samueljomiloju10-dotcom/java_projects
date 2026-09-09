/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleintrest1;
import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class SimpleIntrest1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try{
        double principal, rate , time ,product, simpleIntrest;
        
        
        System.out.println("Enter principal:");
        principal = input.nextDouble();
      
        System.out.println("Enter rate:");
        rate = input.nextDouble();
        
        System.out.println("Enter time:");
        time = input.nextDouble();
        
        product =(principal * rate * time)/ 100 ;
        simpleIntrest = product;
        
        System.out.println("Simple Intrest="+simpleIntrest);
        }catch(Exception e){
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
        }
        
    }

