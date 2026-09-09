/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaoftriangle;
import java.util.Scanner;

/**
 *
 * @author TOYOSI
 */
public class Areaoftriangle {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        try{
        double breadth , height , product , area;
        
        
        System.out.println("Enter breadth:");
        breadth = input.nextDouble();
        
        System.out.println("Enter height:");
        height = input.nextDouble();
        
        product = breadth * height;
       
        area = product/2;
        
        System.out.println("Area="+area);
        }catch(Exception e){
               System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
}

    }
}