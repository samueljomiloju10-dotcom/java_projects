package com.mycompany.loanapp;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LoanApp {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("THIS SOFTWARE IS A LOAN APP");
            
            double loanAmount;
            
            while (true){
                System.out.println("Enter Loan Amount(Naira):");
                loanAmount = scanner.nextDouble();
                
            if (loanAmount <= 0) {
                System.out.println("INVALID LOAN AMOUNT! Kindly input valid loan amount, and try again");
            } else if (loanAmount < 1000) {
                System.out.println("ERROR LOAN AMOUNT LIMIT! Available Loan Amount limit is NGN1,000. Try Again");
                } else {
                break;
             }
            }
            int  totalMonths;
            
            while (true){
                System.out.println("Enter Loan Duration(in months):");
                totalMonths = scanner.nextInt();
             if ((totalMonths <= 0) || (totalMonths > 12)) {
                System.out.println("INVALID MONTH! Month is between 1 - 12.");
            } else {
                 break;
             }
             }

                System.out.println("------------------ LOAN BREAKDOWN ------------------------------");
                System.out.println("----------------------------------------------------------------");

                System.out.printf("%-8s | %-16s | %-17s | %-18s%n",
                        "Month", "Principal Pay", "Interest Amount", "Total Monthly Pay");
                System.out.println("------------------------------------------------------------------");

                double currentBalance = loanAmount;
                double paymentPermonth = loanAmount / totalMonths;
                double intrestRate = 1.5 / 100.0;

                double totalRepayment = 0;
                double totalInterestPaid = 0;
                double totalOverallPaid = 0;

                for (int month = 1; month <= totalMonths; month++) {
                    double interestAmount = currentBalance * intrestRate;
                    double totalMonthlyPayment = paymentPermonth + interestAmount;

                    totalRepayment += paymentPermonth;
                    totalInterestPaid += interestAmount;
                    totalOverallPaid += totalMonthlyPayment;

                    System.out.printf("%-8d | NGN%-15.2f | NGN%-16.2f | NGN%-17.2f%n",
                            month, paymentPermonth, interestAmount, totalMonthlyPayment);

                    currentBalance -= paymentPermonth;
                }

                System.out.println("-------------------------------------------------------------");
                System.out.println("--------------------- LOAN SUMMARY --------------------------");
                System.out.printf("Principal pay is equal to: ........... NGN%,.2f%n", totalRepayment);
                System.out.printf("Interest total amount is equal to: .... NGN%,.2f%n", totalInterestPaid);
                System.out.printf("Total monthly repayment is equal to: .. NGN%,.2f%n", totalOverallPaid);
            }

     catch (Exception e) {
            System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }
    }
    }
