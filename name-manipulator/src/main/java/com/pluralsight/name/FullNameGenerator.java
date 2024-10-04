package com.pluralsight.name;

import java.util.Scanner;

public class FullNameGenerator {

    static Scanner scanley;

    public static String getUserInputWithPrompt(String prompt) {
        System.out.print(prompt);
        return scanley.nextLine();
    }
    public static void main(String[] args){

        scanley = new Scanner(System.in);

        //Talk to the user
        System.out.println("Hello user! I am Quyen, your computer.");
        System.out.println("What should I call you? Starting with your first name.\n");

        // Put together the FULL NAME using StringBuilder
        String firstName = getUserInputWithPrompt("What is your first name? ");
        StringBuilder fullName = new StringBuilder(firstName);

        // Add MIDDLE NAME if the user has one
        String middleName = getUserInputWithPrompt("What is your middle name? ");
        if (!middleName.isBlank()) {
            fullName.append(" ").append(middleName);
        }

        // LAST NAME
        String lastName = getUserInputWithPrompt("What is your last name? ");
        fullName.append(" ").append(lastName);

        // SUFFIX if they have one
        String suffix = getUserInputWithPrompt("What is your suffix name? ");
        if (!suffix.isBlank()) {
            fullName.append(", ").append(suffix).append(".");
        }

        //Lights out
        System.out.println("Thank you, " + fullName.toString() + ", goodbye.");
    }

    }