package com.mycompany.multipurposecalc;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class MultipurposeCalc {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("THIS IS A SOFTWARE TO SOLVE DIFFERENT EQUATIONS ");
            System.out.println("What operation would you like to perform");
            System.out.println("Enter 1 to solve for Boyles law");
            System.out.println("Enter 2 to solve for simple calculation");
            System.out.println("Enter 3 to solve for circumference of circle");
            System.out.println("Enter 4 to solve for area of circle");
            System.out.println("Enter 5 to solve for qudratic equation");
            System.out.println("Enter 6 to access age calculator");
            System.out.println("Enter 7 to access For loop calculation 1");
            System.out.println("Enter 8 to access Do While loop calculation");
            System.out.println("Enter 9 to access While loop calculation");
            System.out.println("Enter 10 to access for loop calculation 2");
            System.out.println("Enter 11 to access for loop E");
            System.out.println("Enter 12 to access for loan App Calculation");
            System.out.println("Enter option (1-12): ");
            int option = input.nextInt();
            if ((option < 1) || (option > 12)) {
                System.out.println("Error,invalid option select an option from 1 to 12.");
            } else {
                if (option == 1) {
                    try {

                        System.out.println("--- This software calculate Boyle's Law (Pressure1 * Volume1 = Pressure2 * Volume2) ---");
                        System.out.println("What value do you want to find?");
                        System.out.println("1 = Initial Pressure (Pressure1)");
                        System.out.println("2 = Initial Volume (Volume1)");
                        System.out.println("3 = Final Pressure (Pressure2)");
                        System.out.println("4 = Final Volume (Volume2)");
                        System.out.println("Enter choice (1-4): ");
                        int choice = input.nextInt();

                        if (option == 1) {
                            System.out.println("Enter Final Pressure (P2): ");
                            double pressure2 = input.nextDouble();
                            System.out.println("Enter Final Volume (volume2): ");
                            double volume2 = input.nextDouble();
                            System.out.println("Enter Initial Volume (volume1): ");
                            double volume1 = input.nextDouble();
                            double result = (pressure2 * volume2) / volume1;
                            System.out.println("Initial Pressure (Pressure1) = " + result);

                        } else if (option == 2) {

                            System.out.println("Enter Final Volume (volume2): ");
                            double volume2 = input.nextDouble();
                            System.out.println("Enter Final Pressure (pressure2): ");
                            double pressure2 = input.nextDouble();
                            System.out.println("Enter Initial Pressure (Pressure1): ");
                            double pressure1 = input.nextDouble();
                            double result = (pressure2 * volume2) / pressure1;
                            System.out.println("Initial Volume (volume1) = " + result);

                        } else if (option == 3) {

                            System.out.println("Enter Initial Pressure (Pressure1): ");
                            double pressure1 = input.nextDouble();
                            System.out.println("Enter Initial Volume (volume1): ");
                            double volume1 = input.nextDouble();
                            System.out.println("Enter Initial Volume (volume1): ");
                            volume1 = input.nextDouble();
                            System.out.println("Enter Final Volume (volume2): ");
                            double volume2 = input.nextDouble();
                            double result = (pressure1 * volume1) / volume2;
                            System.out.println("Final Pressure (pressure2) = " + result);

                        } else if (option == 4) {

                            System.out.print("Enter Initial Pressure (Pressure1): ");
                            double pressure1 = input.nextDouble();
                            System.out.println("Enter Initial Volume (volume1): ");
                            double volume1 = input.nextDouble();
                            System.out.println("Enter Final Pressure (pressure2): ");
                            double pressure2 = input.nextDouble();
                            double result = (pressure1 * volume1) / pressure2;
                            System.out.println("Final Volume (volume2) = " + result);

                        } else {
                            System.out.println("Invalid option! select an option from 1 to 4.");

                        }

                    } catch (Exception e) {
                        System.out.println("ERRROR! Invalid option select an option from 1 to 4");
                    }
                }
            }

            if (option == 2) {
                try {
                    System.out.println("THIS PROFORM SIMPLE CALCULATION");
                    input = new Scanner(System.in);

                    System.out.println("Enter your first number");
                    double firstNumber = input.nextDouble();
                    System.out.println("what operation do you want to perform");
                    System.out.println("Press 1 for adddition");
                    System.out.println("Press 2 for subraction");
                    System.out.println("Press 3 for multiplication");
                    System.out.println("Press 4 for division");
                    System.out.println("Enter choice (1-4)");
                    int Choice = input.nextInt();

                    System.out.println("Enter your Second number");
                    double secondNumber = input.nextDouble();
                    if (Choice == 1) {
                        double result = firstNumber + secondNumber;
                        System.out.println("The result = " + result);
                    } else if (Choice == 2) {
                        double result = firstNumber - secondNumber;
                        System.out.println("The result = " + result);
                    } else if (Choice == 3) {
                        double result = firstNumber * secondNumber;
                        System.out.println("The result = " + result);
                    } else if (Choice == 4) {
                        double result = firstNumber / secondNumber;
                        System.out.println("The result = " + result);
                        System.out.println("Invalid option. Kindly select only one option from 1 to 4 given above.");

                    }
                } catch (Exception e) {
                    System.out.println("ERRROR! Input the apropriate value");

                }

            }
            if (option == 3) {
                try {
                    input = new Scanner(System.in);
                    Double radius, PI, Circumference;

                    System.out.println("THIS SOFTWARE CALCULATE CIRCUMFERENCE OF CIRCLE");

                    System.out.println("ENTER radius");
                    radius = input.nextDouble();
                    PI = 3.142;
                    Circumference = 2 * PI * radius;
                    System.out.println("THE RESULT IS: " + Circumference);
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 4) {
                try {

                    System.out.println("THIS IS A PROGRAM TO CALCULATE THE AREA OF A CIRCLE");
                    System.out.print("Enter the radius to find Area: ");
                    input = new Scanner(System.in);
                    double radius = input.nextDouble();
                    double square = radius * radius;

                    double area = 3.142 * square;

                    System.out.printf("The Area of the circle is: %.2f%n", area);
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");

                }
            }
            if (option == 5) {
                try {
                    System.out.println("THIS SOFTWARE DOES QUADRATIC EQUATION");
                    input = new Scanner(System.in);
                    double a, b, c, d, e, f, g, h, i, j, x1, x2;

                    System.out.println("Enter value for a");
                    a = input.nextDouble();

                    System.out.println("Enter value for b");
                    b = input.nextDouble();

                    System.out.println("Enter value for c");
                    c = input.nextDouble();

                    d = b * b;
                    e = 4 * a * c;
                    f = d - e;
                    g = Math.sqrt(f);
                    h = -b + g;
                    i = -b - g;
                    j = 2 * a;
                    x1 = h / j;
                    x2 = i / j;

                    System.out.println("x1: " + x1);
                    System.out.println("x2: " + x2);
                    System.out.println("The roots are " + x1 + " " + "and " + x2);
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 6) {
                System.out.println("THIS SOFTWARE CALCULATE AGE ");
                LocalDate today = LocalDate.now();
                int thisYear = today.getYear();
                int thisMonth = today.getMonthValue();
                int thisDay = today.getDayOfMonth();
                input = new Scanner(System.in);
                try {
                    System.out.println("Enter birth year: ");
                    int birthYear = input.nextInt();

                    System.out.println("Enter birth month (1-12): ");
                    int birthMonth = input.nextInt();
                    if (birthMonth < 1 || birthMonth > 12) {
                        System.out.println("invalid month! please enter a number between 1 and 12: ");
                    }

                    System.out.println("Enter birth day (1-31): ");
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
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                    System.out.println("Error! Invalid date of birth");

                }
            }
            if (option == 7) {
                try {
                    System.out.println("Simple Multiplication 2");
                    int count, number;
                    number = 2;

                    for (count = 1; count <= 12; count++) {
                        System.out.println(number + " X " + count + " = " + number * count);

                    }
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 8) {
                try {
                    System.out.println("Simple Multiplication");
                    int count, number, length;
                    number = 2;
                    length = 12;
                    count = 1;
                    do {
                        System.out.println(number + " X " + count + " = " + number * count);
                        count++;
                    } while (count <= length);
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 9) {
                try {
                    System.out.println("Simple Multiplication ");
                    int count, number, length;
                    number = 2;
                    length = 12;
                    count = 1;
                    while (count <= length) {
                        System.out.println(number + " X " + count + " = " + (number * count));
                        count++;
                    }
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 10) {
                try {
                    System.out.println("Simple Multiplication Table");
                    input = new Scanner(System.in);
                    int count, number, length;

                    System.out.println("Enter the number you want to calculate");
                    number = input.nextInt();

                    System.out.println("Enter the length you want to calculate to:");
                    length = input.nextInt();
                    for (count = 1; count <= length; count++) {
                        System.out.println(number + " X " + count + " = " + number * count);
                    }
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }
            if (option == 11) {
                try {
                    int count;
                    //       for (count = 1; count <=50; count++) {
                    //           System.out.println(count);
                    //       }
                    //        count = 1;
                    //        while (count <= 10) {
                    //            count++;
                    //        }

                    count = 1;
                    do {
                        System.out.println(count);
                        count++;
                    } while (count <= 10);
                } catch (Exception e) {
                    System.out.println("ERRROR! ERRROR! Input the apropriate value");
                }
            }

            if (option == 12) {
                try {
                    System.out.println("loan app");
                    input = new Scanner(System.in);

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
        } catch (Exception e) {
        }
    }
}
