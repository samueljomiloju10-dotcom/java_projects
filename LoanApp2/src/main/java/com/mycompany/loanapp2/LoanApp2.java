package com.mycompany.loanapp2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LoanApp2 {

    public static void main(String[] args) {
        try {
            System.out.println("loan app");
            Scanner input = new Scanner(System.in);

            System.out.print("Enter Loan Amount (NGN): ");
            double loanAmount = input.nextDouble();
            if (loanAmount <= 0) {
                System.out.println("ERROR! LOAN AMOUNT MUST BE GREATER THAN 0 ");
            } else {
                double monthlyRate = 1.5;

                System.out.println("Monthly Interest Rate set to: " + monthlyRate + "%");

                System.out.print("Enter Loan Duration (in months): ");
                int totalMonths = input.nextInt();

                if (totalMonths <= 0) {
                    System.out.println("ERROR! LOAN DURATION MUST BE GREATER THAN 0 ");
                } else {

                    System.out.println("LOAN BREAKDOWN");
                    System.out.println("----------------------------------------------------------------------");

                    System.out.printf("%-8s | %-16s | %-17s | %-18s%n",
                            "Month", "Monthly Repayment", "Monthly Interest", "Total Monthly Repayment");
                    System.out.println("----------------------------------------------------------------------");

                    double currentBalance = loanAmount;
                    double monthlyRepayment = loanAmount / totalMonths;
                    double rateFraction = monthlyRate / 100.0;

                    double totalmonthlyRepayment = 0;
                    double totalInterestPaid = 0;
                    double totalOverallPaid = 0;

                    for (int month = 1; month <= totalMonths; month++) {

                        if (month == totalMonths) {
                            monthlyRepayment = currentBalance;
                        }

                        double monthlyInterest = currentBalance * rateFraction;
                        double totalMonthlyPayment = monthlyRepayment + monthlyInterest;

                        totalmonthlyRepayment += monthlyRepayment;
                        totalInterestPaid += monthlyInterest;
                        totalOverallPaid += totalMonthlyPayment;

                        System.out.printf("%-8d | NGN %-11.2f | NGN %-12.2f | NGN %-13.2f%n",
                                month, monthlyRepayment, monthlyInterest, totalMonthlyPayment);

                        currentBalance -= monthlyRepayment;
                    }

                    System.out.println("----------------------------------------------------------------------");
                    System.out.printf("Monthly Repayment is equal to: ........... NGN %,.2f%n", totalmonthlyRepayment);
                    System.out.printf("monthlyInterest amount is equal to: .... NGN %,.2f%n", totalInterestPaid);
                    System.out.printf("Total repayment is equal to: .. NGN %,.2f%n", totalOverallPaid);
                }
            }

        } catch (Exception e) {
            System.out.println("ERRROR! ENTER APPROPRIATE VALUE");
        }
    }
}
