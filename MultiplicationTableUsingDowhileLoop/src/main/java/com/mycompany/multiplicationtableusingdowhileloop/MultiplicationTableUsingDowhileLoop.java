/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicationtableusingdowhileloop;

/**
 *
 * @author TOYOSI
 */
public class MultiplicationTableUsingDowhileLoop {

    public static void main(String[] args) {
        try{
        System.out.println("Simple Multiplication");
        int count, number, length;
        number = 2;
        length = 12;
        count = 1;
        do {
            System.out.println(number + " X " + count + " = " + number * count);
            count++;
        }while (count < length);
        } catch(Exception e) {
    }
}
}
