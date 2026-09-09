package com.mycompany.simplemuiltiplicationtableusingwhileloop;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SimpleMuiltiplicationTableUsingWhileLoop {

    public static void main(String[] args) {
        try {
            System.out.println("Simple Multiplication Table");
            Scanner input = new Scanner(System.in);
            int count , number, length;

            System.out.println("Enter the number you want to calculate");
            number = input.nextInt();

            System.out.println("Enter the length you want to calculate to:");
            length = input.nextInt();
            while (count < length) {
                System.out.println(number + " X " + count + " = " + (number * count));
                count++;
            }
        }catch(Exception e){
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT CORRECT INPUT ");
        }
    }
}
