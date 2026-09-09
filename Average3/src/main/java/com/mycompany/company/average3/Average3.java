/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.average3;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Average3 {

    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber, sum, average;
       Scanner inputScanner = new Scanner(System.in);
       
       System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF THREE NUMBERS");
       
       System.out.println("Enter First Number");
       firstNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Second Number");
       secondNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Third Number");
       thirdNumber = inputScanner.nextDouble();
       
        sum = firstNumber + secondNumber + thirdNumber;
        
        average = sum / 3;
        
        System.out.println("Result is " + average);
    }
}
