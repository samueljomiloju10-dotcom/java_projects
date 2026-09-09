/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ajoutfits.company.average2;

import java.util.Scanner;

/**
 *
 * @author New user
 */
public class Average2 {

    public static void main(String[] args) {
        
        double firstNumber, secondNumber, sum, average;
       Scanner inputScanner = new Scanner(System.in);
       
       System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF TWO NUMBERS");
       
       System.out.println("Enter First Number");
       firstNumber = inputScanner.nextDouble();
       
       System.out.println("Enter Second Number");
       secondNumber = inputScanner.nextDouble();
       
        sum = firstNumber + secondNumber;
        
        average = sum / 2;
        
        System.out.println("Result is " + average);
                
                
        
    }
}
