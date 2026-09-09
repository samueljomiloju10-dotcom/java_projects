/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multifunctionsoftware;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author TOYOSI
 */
public class Multifunctionsoftware {

    public static void main(String[] args) {
        try {
            System.out.println();

            Scanner inputScanner = new Scanner(System.in);

            System.out.println("THIS IS A MULTIFUNCTION SOFTWARE ");
            System.out.println("What operation would you like to perform");
            System.out.println("Enter 1 to solve for simple Intrest");
            System.out.println("Enter 2 to solve for sum");
            System.out.println("Enter 3 to solve for circumference of circle");
            System.out.println("Enter 4 to solve for area of circle");
            System.out.println("Enter 5 to solve for qudratic formula");
            System.out.println("Enter 6 to solve price of 50 mangoes");
            System.out.println("Enter 7 to solve for product");
            System.out.println("Enter 8 to salary deduction");
            System.out.println("Enter 9 to solve fraction");
            System.out.println("Enter 10 to solve highest of 3 numbers");
            System.out.println("Enter 11 to solve highest of 4 numbers");
            System.out.println("Enter 12 to solve highest of 5 numbers");
            System.out.println("Enter 13 to solve Average of 3 numbers");
            System.out.println("Enter 14 to solve Average of 5 numbers");
            System.out.println("Enter 15 to solve Average of 10 numbers");
            System.out.println("Enter 16 to check Body mass index");
            System.out.println("Enter 17 to solve Area of triangle");
            System.out.println("Enter 18 to calculate Age");
            System.out.println("Enter 19 to check multiplication table");
            System.out.println("Enter 20 for your Loan");
            


            System.out.println("Enter option (1-20): ");
            int option = inputScanner.nextInt();
            if ((option < 1) || (option > 20)) {
                System.out.println("Error,invalid option select an option from 1 to 20.");
                option = inputScanner.nextInt();
            } else {
                if (option == 1) {
                    try {

                        double principal, rate, time, product, simpleIntrest;

                        System.out.println("Enter principal:");
                        principal = inputScanner.nextDouble();

                        System.out.println("Enter rate:");
                        rate = inputScanner.nextDouble();

                        System.out.println("Enter time:");
                        time = inputScanner.nextDouble();

                        product = (principal * rate * time) / 100;
                        simpleIntrest = product;

                        System.out.println("Simple Intrest=" + simpleIntrest);
                    } catch (Exception e) {
                        System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                    }
                }

                if (option == 2) {
                    try {
                        double firstNumber, secondNumber, sum;

                        System.out.println("THIS SOFTWARE CALCULATE SUM OF TWO NUMBER");

                        System.out.println("Enter First Number");
                        firstNumber = inputScanner.nextDouble();

                        System.out.println("Enter Second Number");
                        secondNumber = inputScanner.nextDouble();

                        sum = firstNumber + secondNumber;

                        System.out.println("Result is " + sum);

                    } catch (Exception e) {
                        System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                    }
                }

                if (option == 3) {
                    try {
                        double radius, product, circumference;

                        System.out.println("Enter Radius:");
                        radius = inputScanner.nextDouble();

                        product = 2 * 3.142 * radius;
                        circumference = product;

                        System.out.println("Circumference=" + circumference);
                    } catch (Exception e) {
                        System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                    }
                }
            }

            if (option == 4) {
                try {
                    double radius, product, area;

                    System.out.println("Enter Radius:");
                    radius = inputScanner.nextDouble();

                    product = 3.142 * radius * radius;
                    area = product;

                    System.out.println("Area=" + area);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 5) {
                try {
                    double a, b, c, product1, product2, subtraction1, squareroot, subtraction2, product3, x1, x2;

                    System.out.println("THIS SOFTWARE CALCULATES QUADRATIC FORMULA");

                    System.out.println("a");
                    a = inputScanner.nextDouble();

                    System.out.println("b");
                    b = inputScanner.nextDouble();

                    System.out.println("c");
                    c = inputScanner.nextDouble();

                    product1 = b * b;

                    product2 = 4 * a * c;

                    subtraction1 = product1 - product2;

                    squareroot = Math.sqrt(subtraction1);
                    subtraction2 = -b;

                    product3 = 2 * a;

                    x1 = (subtraction2 - squareroot) / product3;
                    x2 = (subtraction2 + squareroot) / product3;
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }
            if (option == 6) {
                try {
                    double price, product, tprice;
                    System.out.println("Enter price of one mango:");
                    price = inputScanner.nextDouble();

                    product = price * 50;
                    tprice = product;

                    System.out.println("total price=" + tprice);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 7) {
                try {
                    int firstNumber, secondNumber, product;

                    System.out.print("Enter first number");
                    firstNumber = inputScanner.nextInt();

                    System.out.println("Enter second number");
                    secondNumber = inputScanner.nextInt();

                    product = firstNumber * secondNumber;
                    System.out.println("Product= " + product);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 8) {
                try {
                    double salary, salaryDeduction, percentage, difference, salaryRemaining;

                    System.out.println("Enter Salary :");
                    salary = inputScanner.nextDouble();

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

            if (option == 9) {
                try {
                    double firstNumber, secondNumber, division;

                    System.out.print("Enter first number");
                    firstNumber = inputScanner.nextDouble();

                    System.out.print("Enter second number");
                    secondNumber = inputScanner.nextDouble();
                    division = firstNumber / secondNumber;
                    System.out.println("Division is " + division);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 10) {
                try {
                    double firstNumber, secondNumber, thirdNumber;
                    System.out.println("HIGHEST OF THREE NUMBERS");

                    System.out.println(" ENTER FIRST NUMBER ");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER SECOND NUMBER ");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER THIRD NUMBER ");
                    thirdNumber = inputScanner.nextDouble();

                    if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
                        System.out.println(firstNumber + " IS THE HIGHEST NUMBER");

                    } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
                        System.out.println(secondNumber + " IS THE HIGHEST NUMBER");

                    } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
                        System.out.println(thirdNumber + " IS THE HIGHEST NUMBER");
                    } else {
                        System.out.println("ALL NUMBERS ARE EQUAL");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 11) {
                try {
                    double firstNumber, secondNumber, thirdNumber, fourthNumber;
                    System.out.println("HIGHEST OF FOUR NUMBERS");

                    System.out.println(" ENTER FIRST NUMBER ");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER SECOND NUMBER ");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER THIRD NUMBER ");
                    thirdNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER FOURTH NUMBER");
                    fourthNumber = inputScanner.nextDouble();

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

            if (option == 12) {
                try {
                    double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

                    System.out.println(" THE HIGHEST OF FIVE NUMBERS ");

                    System.out.println(" ENTER FIRST NUMBER ");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER SECOND NUMBER ");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER THIRD NUMBER ");
                    thirdNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER FOURTH NUMBER ");
                    fourthNumber = inputScanner.nextDouble();

                    System.out.println(" ENTER FIFTH NUMBER ");
                    fifthNumber = inputScanner.nextDouble();

                    if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (firstNumber > fourthNumber) && (firstNumber > fifthNumber)) {
                        System.out.println(firstNumber + " IS THE HIGHEST NUMBER");
                    } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber) && (secondNumber > fourthNumber) && (secondNumber > fifthNumber)) {
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

            if (option == 13) {
                try {
                    double firstNumber, secondNumber, thirdNumber, sum, average;

                    System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF THREE NUMBERS");

                    System.out.println("Enter First Number");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println("Enter Second Number");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println("Enter Third Number");
                    thirdNumber = inputScanner.nextDouble();

                    sum = firstNumber + secondNumber + thirdNumber;

                    average = sum / 3;

                    System.out.println("Result is " + average);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");

                }
            }

            if (option == 14) {
                try {
                    double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sum, average;

                    System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF FIVE NUMBERS");

                    System.out.println("Enter First Number");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println("Enter Second Number");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println("Enter Third Number");
                    thirdNumber = inputScanner.nextDouble();

                    System.out.println("Enter Fourth Number");
                    fourthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Fifth Number");
                    fifthNumber = inputScanner.nextDouble();

                    sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

                    average = sum / 5;

                    System.out.println("Result is " + average);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");

                }
            }

            if (option == 15) {
                try {
                    double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber, seventhNumber, eighthNumber, ninthNumber, tenthNumber, sum, average;

                    System.out.println("THIS SOFTWARE CALCULATES AVERAGE OF TEN NUMBERS");

                    System.out.println("Enter First Number");
                    firstNumber = inputScanner.nextDouble();

                    System.out.println("Enter Second Number");
                    secondNumber = inputScanner.nextDouble();

                    System.out.println("Enter Third Number");
                    thirdNumber = inputScanner.nextDouble();

                    System.out.println("Enter Fourth Number");
                    fourthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Fifth Number");
                    fifthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Sixth Number");
                    sixthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Seventh Number");
                    seventhNumber = inputScanner.nextDouble();

                    System.out.println("Enter Eighth Number");
                    eighthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Ninth Number");
                    ninthNumber = inputScanner.nextDouble();

                    System.out.println("Enter Tenth Number");
                    tenthNumber = inputScanner.nextDouble();

                    sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninthNumber + tenthNumber;

                    average = sum / 10;

                    System.out.println("Result is " + average);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");

                }
            }

            if (option == 16) {
                try {
                    double Weight, Height, Product, bodyMass;

                    System.out.println("Enter Weight:");
                    Weight = inputScanner.nextDouble();

                    System.out.println("Enter Height:");
                    Height = inputScanner.nextDouble();

                    Product = Height * Height;
                    bodyMass = Weight / Product;

                    System.out.println("Body Mass=" + bodyMass);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }

            if (option == 17) {
                LocalDate today = LocalDate.now();
                int thisYear = today.getYear();
                int thisMonth = today.getMonthValue();
                int thisDay = today.getDayOfMonth();
                try {
                    double breadth, height, product, area;

                    System.out.println("Enter breadth:");
                    breadth = inputScanner.nextDouble();

                    System.out.println("Enter height:");
                    height = inputScanner.nextDouble();

                    product = breadth * height;

                    area = product / 2;

                    System.out.println("Area=" + area);
                } catch (Exception e) {
                    System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
                }
            }
                if (option == 18) {
                    LocalDate today = LocalDate.now();
                    int thisYear = today.getYear();
                    int thisMonth = today.getMonthValue();
                    int thisDay = today.getDayOfMonth();
                    Scanner input = new Scanner(System.in);
                    try {
                        System.out.println("Enter birth year: ");
                        int birthYear = input.nextInt();

                        System.out.println("Enter birth month (1-12): ");
                        int birthMonth = input.nextInt();
                        if (birthMonth < 1 || birthMonth > 12) {
                            System.out.println("invalid month! please enter a number between 1 and 12: ");
                        }

                        System.out.println("Enter birth day : ");
                        int birthDay = input.nextInt();
                        if (birthDay < 1 || birthDay > 31) {
                            System.out.println("invalid invalid day! please enter a number between 1 and 31: ");
                        }
                        int userAge = thisYear - birthYear;
                        if (birthMonth > thisMonth) {
                            userAge = userAge - 1;
                        }
                        if (birthMonth == thisMonth) {
                            if (birthDay > thisDay) {
                                userAge = userAge - 1;
                            }
                        }

                        java.time.LocalDate birthDate = java.time.LocalDate.of(birthYear, birthMonth, birthDay);
                        java.time.Period agePeriod = java.time.Period.between(birthDate, today);

                        int remainingMonths = agePeriod.getMonths();
                        int daysRemaining = agePeriod.getDays();

                        System.out.println("You are " + userAge + " years, " + remainingMonths + " months, and " + daysRemaining + " days old.");
                    } catch (Exception e) {
                        System.out.println("Error! Invalid date of birth");
                    }
                }   
                if (option == 19) {
                     try{
        System.out.println("Simple Multiplication");
        int count, number, length;
        number = 2;
        length = 12;
        count = 1;
        do {
            System.out.println(number + " X " + count + " = " + number * count);
            count++;
        }while (count <= length);
        } catch(Exception e) {
    }
}
        if (option == 20) {
                try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("THIS SOFTWARE IS A LOAN APP");

            System.out.println("Enter Loan Amount (Naira): ");
            double loanAmount = scanner.nextDouble();

            System.out.println("Enter Time Period (in months): ");
            int totalMonths = scanner.nextInt();

            System.out.println("LOAN SUMMARY");
            System.out.println("----------------------------------------------------------------------");

            System.out.printf("%-8s | %-16s | %-17s | %-18s%n",
                    "Month", "Principal Pay", "Interest Amount", "Total Monthly Pay");
            System.out.println("----------------------------------------------------------------------");

            double currentBalance = loanAmount;
            double paymentPermonth = loanAmount / totalMonths;
            double intrestRate = 1.5 / 100.0;

            double totalPrincipalPaid = 0;
            double totalInterestPaid = 0;
            double totalOverallPaid = 0;

            for (int month = 1; month <= totalMonths; month++) {
                double interestAmount = currentBalance * intrestRate;
                double totalMonthlyPayment = paymentPermonth + interestAmount;

                totalPrincipalPaid += paymentPermonth;
                totalInterestPaid += interestAmount;
                totalOverallPaid += totalMonthlyPayment;

                System.out.printf("%-8d | NGN%-15.2f | NGN%-16.2f | NGN%-17.2f%n",
                        month, paymentPermonth, interestAmount, totalMonthlyPayment);

                currentBalance -= paymentPermonth;
            }

            System.out.println("----------------------------------------------------------------------");
            System.out.printf("Principal pay is equal to: ........... NGN%,.2f%n", totalPrincipalPaid);
            System.out.printf("Interest total amount is equal to: .... NGN%,.2f%n", totalInterestPaid);
            System.out.printf("Total monthly repayment is equal to: .. NGN%,.2f%n", totalOverallPaid);

        } catch (Exception e) {
        }System.out.println("ERROR! INVALID INPUT COMMAND. KINDLY INPUT VALID NUMBER ");
        }

       
  } catch (Exception e) {
            System.out.println("Error! Invalid Input");
        }
    }
}