package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    // Created an Array of 20 Books
    static Book[] books = new Book[20];

    //Created Scanner
    static Scanner scanner = new Scanner(System.in);

    // bookTracker
    public static int bookTracker = 20;

    //Filling the Array with Books
    public static void main(String[] args) {
        books[0] = new Book(1, "978-0-00-000009-1", "The Great Gasby", true, "Jacob Nealy");
        books[1] = new Book(2, "978-0-00-000001-5", "Atomic Habits", false, " ");
        books[2] = new Book(3, "978-0-00-000002-6", "The Hobbit", true, "Raymound Mourn");
        books[3] = new Book(4, "978-0-00-000003-1", "Lord of Rings", true, "Julianna Vaccaro");
        books[4] = new Book(5, "978-0-00-000004-8", "15 Laws of Teamwork", false, " ");
        books[5] = new Book(6, "978-0-00-000005-5", "The 4th Dimension", true, "Emanuel Galloway");
        books[6] = new Book(7, "978-0-00-000006-2", "Consolidation", false, " ");
        books[7] = new Book(8, "978-0-00-000007-9", "I don't have enough Faith to be an Atheist", true, "Jaden Morris-Law");
        books[8] = new Book(9, "978-0-00-000008-6", "15 laws of Leadership", true, "Nikiya Bing");
        books[9] = new Book(10, "978-0-00-000009-3", "The Girl on the train", false, " ");
        books[10] = new Book(11, "978-0-00-000010-9", "Milestones", true, "Michael Settle");
        books[11] = new Book(12, "978-0-00-000011-6", "If he had been with me", true, "Brandon Morse");
        books[12] = new Book(13, "978-0-00-000012-3", "Liar", false, " ");
        books[13] = new Book(14, "978-0-00-000013-0", "Emmie and Oliver", true, "Jessie Nwokoye");
        books[14] = new Book(15, "978-0-00-000014-7", "Me and Earl and the Dying Girl", true, "Jacob Nealy");
        books[15] = new Book(16, "978-0-00-000015-4", "Fight Club", false, " ");
        books[16] = new Book(17, "978-0-00-000016-1", "Momentum", true, "Raymound Mourn");
        books[17] = new Book(18, "978-0-00-000017-8", "Shudder Island", false, " ");
        books[18] = new Book(19, "978-0-00-000018-5", "Moby Dick", true, "Clarissa Vann");
        books[19] = new Book(20, "978-0-00-000019-2", "American Psycho", true, "Bartholomew Cornelius Winchester-Jackson the Third, Esquire");


        // Do While or While: to Loop Back to Home Screen (boolean while true)
        while (true) {

            // Display Store Home Screen
            displayHomeScreen();

            int homeScreenSelection = scanner.nextInt();

            // Switch Cases based on User Option Choice
            switch (homeScreenSelection) {

                // Case 1: Show Available Books and Allow User to Check Out or Go Home
                case 1:
                    // Print Available Books
                    System.out.println("List of UnChecked-Out Books");
                    for (int i = 0; i < bookTracker; i++) {
                        if (books[i].isCheckedout() == false) {
                            System.out.println(books[i]);
                        }
                    }

                    // Prompt User to Go back to Home Screen or Select Book to check out
                    System.out.println("Please select a book to check out by entering ID or entering '0' to go back to Home Screen: ");
                    int bookIdSelection = scanner.nextInt();
                    scanner.nextLine(); // Scanner Eater

                    // Go Back to Home Screen
                    if (bookIdSelection == 0)
                        break;

                    // Show Book Selection and Set Name
                    System.out.println("You have selected" + books[--bookIdSelection]);
                    System.out.print("Please Enter your name to Check Out Book: ");
                    String name = scanner.nextLine();

                    // Check Out Book with User's name
                    if (!books[bookIdSelection].isCheckedout()) {
                        books[bookIdSelection].setCheckedOutTo(name);
                        books[bookIdSelection].setCheckedout(true);
                        System.out.println("The book has been successfully checked out to " + name);

                    } else {
                        System.out.println("This book is already checked out. Returning you to Home Screen");
                    }
                    break;

                case 2: {
                    System.out.println("This is Case 2");
                }

                case 3: {

                }
            }
        }


    }

    public static void displayHomeScreen() {
        System.out.println("\nWelcome to the Library Home Screen!");
        System.out.println("Please select an option below by entering a number\n");

        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit Library Application\n");
        System.out.print("Please Enter Number Choice Here: ");
    }
}
