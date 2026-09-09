/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circumferenceofcircle2;

import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class Circumferenceofcircle2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try{
        double radius , product , circumference;
        
        
        System.out.println("Enter Radius:");
        radius = input.nextDouble();
        
        product = 2 * 3.142 * radius ;
        circumference = product;
        
        System.out.println("Circumference="+circumference);
         }catch(Exception e){
               System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
    }
    }
}