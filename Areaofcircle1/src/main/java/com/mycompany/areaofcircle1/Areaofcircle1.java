/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaofcircle1;

import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class Areaofcircle1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        try{
        double radius , product , area;
        
        
        System.out.println("Enter Radius:");
        radius = input.nextDouble();
        
        product = 3.142 * radius * radius;
        area = product;
        
        System.out.println("Area="+area);
        }catch(Exception e){
               System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
}
