package com.pluralsight.name;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Talk to the user
        System.out.println("Hello user! I am Quyen, your computer.");
        System.out.println("What should I call you?\n");

        // Prompt for FULL NAME & use .trim()
        System.out.print("Enter your full name as (First Middle Last) or (First Last): ");
        String fullNameInput = scanner.nextLine().trim();


        // SPLIT the user input using " "
        String[] nameParts = fullNameInput.split(" ");


        // Break down AND check parts of the name
        String firstName = nameParts[0];

        String lastName = nameParts[nameParts.length - 1];

        String middleName = nameParts.length == 3 ? nameParts[1] : "";


        // Display pieces of the name
        System.out.println("First Name: " + firstName);

        if (nameParts.length == 2) {
            firstName = nameParts[0];
            middleName = "";
            lastName = nameParts[1];
        }
        if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

        System.out.println("Middle Name:" + middleName);
        System.out.println("Last Name: " + lastName);

        //Lights out
        System.out.println("Thank you, goodbye.");

    }
}

