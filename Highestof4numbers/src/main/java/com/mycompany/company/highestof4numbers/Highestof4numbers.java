/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.highestof4numbers;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Highestof4numbers {

    public static void main(String[] args) {
         try {
            double firstNumber, secondNumber, thirdNumber, fourthNumber;
            Scanner input = new Scanner(System.in);

            System.out.println("HIGHEST OF FOUR NUMBERS");
            
            System.out.println(" ENTER FIRST NUMBER ");
            firstNumber = input.nextDouble();

            System.out.println(" ENTER SECOND NUMBER ");
            secondNumber = input.nextDouble();

            System.out.println(" ENTER THIRD NUMBER ");
            thirdNumber = input.nextDouble();

            System.out.println(" ENTER FOURTH NUMBER");
            fourthNumber = input.nextDouble();

            if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (firstNumber > fourthNumber)) {
                System.out.println(firstNumber + " IS THE HIGHEST NUMBER");
            } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber) && (secondNumber > fourthNumber)) {
                System.out.println(secondNumber + " IS THE HIGHEST NUMBER");
            } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber) && (thirdNumber > fourthNumber)) {
                System.out.println(thirdNumber + " IS THE HIGHEST NUMBER");
            } else if ((fourthNumber > firstNumber) && (fourthNumber > secondNumber) && (fourthNumber > thirdNumber)) {
                System.out.println(fourthNumber + " IS THE HIGHEST NUMBER");
            } else {
                System.out.println("ALL NUMBERS ARE EQUAL");
            }
        } catch (Exception e) {
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
}


