package com.mycompany.simplemultilicationtableusingforloop2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SimpleMultilicationTableUsingForLoop2 {

    public static void main(String[] args) {
        try {
            System.out.println("Simple Multiplication Table");
            Scanner input = new Scanner(System.in);
            double count, number, length;

            System.out.println("Enter the number you want to calculate");
            number = input.nextDouble();

            System.out.println("Enter the length you want to calculate to:");
           length = input.nextDouble();
            for (count = 1; count <= length; count++) {
                System.out.println(number + " X " + count + " = " + number * count);
            }
        }catch(Exception e){
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT CORRECT INPUT ");
        }
        
    }
}
