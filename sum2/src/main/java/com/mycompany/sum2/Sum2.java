/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sum2;

import java.util.Scanner;

/**
 *
 * @author TOYOSI
 */
public class Sum2 {

    public static void main(String[] args) {
       double firstNumber, secondNumber,sum;
       Scanner inputScanner = new Scanner(System.in);
       
       
      System.out.println("THIS SOFTWARE CALCULATE SUM OF TWO NUMBER");
      
       System.out.println("Enter First Number");
       firstNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Second Number");
       secondNumber = inputScanner.nextDouble();
       
       sum = firstNumber + secondNumber;
       
       System.out.println("Result is "+ sum);       
 
      
      
      
    }
}
