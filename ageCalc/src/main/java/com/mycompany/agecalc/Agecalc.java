package com.mycompany.agecalc;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Agecalc {

    public static void main(String[] args) {
        System.out.println("THIS SOFTWARE CALCULATE AGE ");
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
}
