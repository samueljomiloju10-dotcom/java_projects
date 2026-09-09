/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bodymassindex;
import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class Bodymassindex {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        try{
        double Weight, Height,Product,bodyMass;
        
        
        System.out.println("Enter Weight:");
        Weight = input.nextDouble();
        
         System.out.println("Enter Height:");
        Height = input.nextDouble();
        
       
        Product = Height * Height;
        bodyMass = Weight/Product;
        
        System.out.println("Body Mass="+bodyMass);
        }catch(Exception e){
               System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
}
