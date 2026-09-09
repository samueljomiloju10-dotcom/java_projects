/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.salarydeduction;

import java.util.Scanner;

/**
 *
 * @author TOYOSI
 */
public class Salarydeduction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            double salary, salaryDeduction, percentage, difference, salaryRemaining;
 
            System.out.println("Enter Salary :");
            salary = input.nextDouble();

            percentage = (5.0 / 100) * salary;
            salaryDeduction = percentage;

            System.out.println(" Salary = " + salary);

            System.out.println("Salary Deduction= " + salaryDeduction);

            difference = salary - salaryDeduction;
            salaryRemaining = difference;
            System.out.println("Salary Remaining=" + salaryRemaining);
        } catch (Exception e) {
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
}
