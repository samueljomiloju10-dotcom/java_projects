/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.company.highestof5numbers;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Highestof5numbers {

    public static void main(String[] args) {
         try {
            double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;
            Scanner input = new Scanner(System.in);

            System.out.println(" THE HIGHEST OF FIVE NUMBERS ");
            
            System.out.println(" ENTER FIRST NUMBER ");
            firstNumber = input.nextDouble();

            System.out.println(" ENTER SECOND NUMBER ");
            secondNumber = input.nextDouble();

            System.out.println(" ENTER THIRD NUMBER ");
            thirdNumber = input.nextDouble();

            System.out.println(" ENTER FOURTH NUMBER ");
            fourthNumber = input.nextDouble();

            System.out.println(" ENTER FIFTH NUMBER ");
            fifthNumber = input.nextDouble();

            if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) &&( firstNumber > fourthNumber) &&( firstNumber > fifthNumber)) {
                System.out.println(firstNumber + " IS THE HIGHEST NUMBER");
            } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber) &&( secondNumber > fourthNumber) && (secondNumber > fifthNumber)) {
                System.out.println(secondNumber + " IS THE HIGHEST NUMBER");
            } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber) && (thirdNumber > fourthNumber) && (thirdNumber > fifthNumber)) {
                System.out.println(thirdNumber + " IS THE HIGHEST NUMBER");
            } else if ((fourthNumber > firstNumber) && (fourthNumber > secondNumber) && (fourthNumber > thirdNumber) && (fourthNumber > fifthNumber)) {
                System.out.println(fourthNumber + " IS THE HIGHEST NUMBER");
            } else if ((fifthNumber > firstNumber) && (fifthNumber > secondNumber) && (fifthNumber > thirdNumber) && (fifthNumber > fourthNumber)) {
                System.out.println(fifthNumber + " IS THE HIGHEST NUMBER");
            } else {
                System.out.println("ALL NUMBERS ARE EQUAL");
            }
        } catch (Exception e) {
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
}
 
