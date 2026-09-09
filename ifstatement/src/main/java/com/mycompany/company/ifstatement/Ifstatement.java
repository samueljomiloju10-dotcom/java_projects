/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.ifstatement;
import java.util.Scanner;
/**
 *
 * @author New user
 */
public class Ifstatement {

    public static void main(String[] args) {
        double firstNumber, secondNumber;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Enter First Number");
       firstNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Second Number");
       secondNumber = inputScanner.nextDouble();
       
       if (firstNumber > secondNumber){
           System.out.println("First Number is the highest " + firstNumber);
       } else if (secondNumber > firstNumber) {
           System.out.println("Second Number is the highest " + secondNumber);
       } else  {
         System.out.println("All numbers are equal");
         
       }
    }
}
