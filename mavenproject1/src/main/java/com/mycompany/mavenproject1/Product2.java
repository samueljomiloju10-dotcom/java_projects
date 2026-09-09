/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author TOYOSI
 */
public class Product2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int firstNumber, secondNumber, product;
        
        System.out.print("Enter first number");
        firstNumber = input.nextInt();
        
        System.out.println("Enter second number");
        secondNumber = input.nextInt();
        
        product = firstNumber * secondNumber;
        System.out.println("Product= "+ product);   
    }
}
