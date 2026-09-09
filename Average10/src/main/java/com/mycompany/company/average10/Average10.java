/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.average10;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Average10 {

    public static void main(String[] args) {
        double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber, seventhNumber, eighthNumber, ninthNumber, tenthNumber, sum, average;
       Scanner inputScanner = new Scanner(System.in);
       
       System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF TEN NUMBERS");
       
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
              
        System.out.println("Enter Sixth Number");
       sixthNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Seventh Number");
       seventhNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Eighth Number");
       eighthNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Ninth Number");
       ninthNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Tenth Number");
       tenthNumber = inputScanner.nextDouble();
       
        sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninthNumber + tenthNumber;
        
        average = sum / 10;
        
        System.out.println("Result is " + average);
    }
}
