/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.average5;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Average5 {

    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sum, average;
       Scanner inputScanner = new Scanner(System.in);
       
       System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF FIVE NUMBERS");
       
       System.out.println("Enter First Number");
       firstNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Second Number");
       secondNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Third Number");
       thirdNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Fourth Number");
       fourthNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Fifth Number");
       fifthNumber = inputScanner.nextDouble();
       
        sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        
        average = sum / 5;
        
        System.out.println("Result is " + average);
    }
}
