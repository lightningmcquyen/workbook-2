package com.pluralsight.library;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner scanley = new Scanner(System.in);
        int choice;

        // Make home screen: show available books, show checked-out books, check-in a book, exit
        System.out.println("Please select one of the following options to proceed:");
        System.out.println("1. Show available books");
        System.out.println("2. Show checked-out books)");
        System.out.println("3. Check-in a book");
        System.out.println("4. Exit");
        System.out.print("Select Options 1 - 4: ");
        choice = scanley.nextInt();

        switch (choice) {
            case 1 -> { //Show available books and allow for check-out
            }


            case 2 -> { //Show checked-out books

            }

            case 3 -> { //Check-in a book books


            }
        }

        // Show available books: display a list of all books not currently checked out.
        //Display the id, isbn, and title
        //Prompt user to either selected a book to check out or exit to go back to home screen
        //If the user wants to check out a book, prompt them for their name and check out the book

        //Show checked out books: show list of books currently checked out.
        //Display the id, isbn, and title
        //C - to Check In a book
        //X - to go back to the home screen

        //Check In a book: prompt the user for the id of the book they want to check in
        //Check-in the book with the specified id
        //X - to go back to the home screen

    }
}

