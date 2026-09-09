/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadraticformula1;
import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class QuadraticFormula1 {

    public static void main(String[] args) {
         double a , b , c , product1 , product2 , subtraction1 , squareroot , subtraction2 , product3 , x;
        Scanner inputScanner = new Scanner(System.in);
         
         System.out.println("THIS SOFTWARE CALCULATES QUADRATIC FORMULA");
        
        System.out.println("a");
        a = inputScanner.nextDouble();
        
          System.out.println("b");
        b = inputScanner.nextDouble();
        
          System.out.println("c");
        c = inputScanner.nextDouble();
        
        product1 = b * b;
        
        product2 = 4 * a * c;
        
        subtraction1 = product1 - product2;
        
        squareroot = Math.sqrt(subtraction1);
        subtraction2 = -b;
        
        product3 = 2 * a;
        
   double x1 = (subtraction2 - squareroot)/product3;
   double x2 = (subtraction2 + squareroot)/product3;
    }
}
