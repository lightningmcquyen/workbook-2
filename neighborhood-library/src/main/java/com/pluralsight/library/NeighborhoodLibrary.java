package com.pluralsight.library;

import java.util.Scanner;

public class NeighborhoodLibrary {

    public static Scanner scanley = new Scanner(System.in);

    public static void main(String[] args) {
        //HOMEEEEEE
        Library();
    }

    public static void Library() {

        Book[] book = new Book[20];
        book[0] = new Book(1, "978-0439358071", "Harry Potter and the Order of the Phoenix", "", false);
        book[1] = new Book(2, "978-0439136365", "Harry Potter and the Goblet of Fire", "", false);
        book[2] = new Book(3, "978-0786817078", "Percy Jackson: The Lightning Thief", "", false);
        book[3] = new Book(4, "978-0066238500", "The Tale of Despereaux", "", false);
        book[4] = new Book(5, "978-0064407664", "The Tale of Peter Rabbit", "", false);
        book[5] = new Book(6, "978-0060294625", "Eragon", "", false);
        book[6] = new Book(7, "978-0316160179", "Twilight", "", false);
        book[7] = new Book(8, "978-0060294632", "The City of Ember", "", false);
        book[8] = new Book(9, "978-0375826689", "The Sisterhood of the Traveling Pants", "", false);
        book[9] = new Book(10, "978-0439064873", "Harry Potter and the Chamber of Secrets", "", false);
        book[10] = new Book(11, "978-0142402511", "Holes", "", false);
        book[11] = new Book(12, "978-0545139700", "Diary of a Wimpy Kid", "", false);
        book[12] = new Book(13, "978-0786856298", "Inkheart", "", false);
        book[13] = new Book(14, "978-0385737951", "The Hunger Games", "", false);
        book[14] = new Book(15, "978-0064410328", "The Spiderwick Chronicles", "", false);
        book[15] = new Book(16, "978-0060294564", "Artemis Fowl", "", false);
        book[16] = new Book(17, "978-0439708180", "A Series of Unfortunate Events: The Bad Beginning", "", false);
        book[17] = new Book(18, "978-0439539652", "Because of Winn-Dixie", "", false);
        book[18] = new Book(19, "978-0545010221", "The Invention of Hugo Cabret", "", false);
        book[19] = new Book(20, "978-0763645029", "The Miraculous Journey of Edward Tulane", "", false);


        //Menu
        System.out.println("Welcome!");
        System.out.println("\n------ Neighborhood Library Menu ------");
        System.out.println("(1) Available Books");
        System.out.println("(2) Currently Unavailable Books");
        System.out.println("(3) Exit");
        System.out.print("Select an option: ");

        int option = scanley.nextInt();

        switch (option) {
            case 1 -> AvailableBooks(book);
            case 2 -> CheckedOutBooks(book);
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid");
        }
    }


    // Available books
    public static void AvailableBooks(Book[] book) {
        System.out.println("Books available:");
        for (Book item : book) {
            if (!item.getIsCheckedOut()) {
                System.out.println(item.toString());
            }
        }
        //Check-out or Exit back
        System.out.println("\n (1) Check out\n (2) Library Menu\n Please select 1 or 2:");
        int option = scanley.nextInt();
        scanley.nextLine();

        switch (option) {
            case 1 -> {
                System.out.println("First and Last Name: ");
                String name = scanley.nextLine().trim();
                System.out.println("Book ID: ");
                int bookId = scanley.nextInt();
                for (Book item : book) {
                    if (item.getId() == bookId) {
                        item.checkOut(name);
                        System.out.println("\nChecked out to " + name + ".");
                    }
                }
            }
            case 2 -> Library();
            default -> System.out.println("Invalid");
        }
    }


    //Unavailable Books
    public static void CheckedOutBooks(Book[] book) {
        System.out.println("Books Currently Checked-out");
        for (Book item : book) {
            if (!item.getIsCheckedOut()) {
                System.out.println(item.toString() + "\nChecked-out to: " + item.getCheckedOutTo());
            }

        }
        //Check-in book or Exit back
        System.out.println("\n (1) Check-in\n (2) Library Menu\n Please select 1 or 2:");
        int option = scanley.nextInt();
        scanley.nextLine();

        switch (option) {
            case 1 -> {
                System.out.println("Book Id: ");
                int bookId = scanley.nextInt();
                for (Book item : book) {
                    if (item.getId() == bookId) {
                        item.checkIn();
                        System.out.println("Returned");
                    }
                }
            }
            case 2 -> {
                Library();
            }
        }
    }
}
