package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    // Created an Array of 20 Books
    private static Book[] books = new Book[20];

    //Created Scanner
    static Scanner scanner = new Scanner(System.in);

    //Filling the Array with Books
    public static void main(String[] args) {
        books[0] = new Book (1001, "978-0-00-000009-1", true ,  "Jacob Nealy"       );
        books[1] = new Book (1002, "978-0-00-000001-5", false,  " "                 );
        books[2] = new Book (1003, "978-0-00-000002-6", true ,  "Raymound Mourn"    );
        books[3]  = new Book(1004, "978-0-00-000003-1", true , "Julianna Vaccaro"   );
        books[4]  = new Book(1005, "978-0-00-000004-8", false, " "                  );
        books[5]  = new Book(1006, "978-0-00-000005-5", true , "Emanuel Galloway"   );
        books[6]  = new Book(1007, "978-0-00-000006-2", false, " "                  );
        books[7]  = new Book(1008, "978-0-00-000007-9", true , "Jaden Morris-Law"   );
        books[8]  = new Book(1009, "978-0-00-000008-6", true , "Nikiya Bing"        );
        books[9]  = new Book(1010, "978-0-00-000009-3", false, " "                  );
        books[10] = new Book(1011, "978-0-00-000010-9", true , "Michael Settle"     );
        books[11] = new Book(1012, "978-0-00-000011-6", true , "Brandon Morse"      );
        books[12] = new Book(1013, "978-0-00-000012-3", false, " "                  );
        books[13] = new Book(1014, "978-0-00-000013-0", true , "Jessie Nwokoye"     );
        books[14] = new Book(1015, "978-0-00-000014-7", true , "Jacob Nealy"        );
        books[15] = new Book(1016, "978-0-00-000015-4", false, " "                  );
        books[16] = new Book(1017, "978-0-00-000016-1", true , "Raymound Mourn"     );
        books[17] = new Book(1018, "978-0-00-000017-8", false, " "                  );
        books[18] = new Book(1019, "978-0-00-000018-5", true , "Clarissa Vann"      );
        books[19] = new Book(1020, "978-0-00-000019-2", true, "Bartholomew Cornelius Winchester-Jackson the Third, Esquire");








        // Display Store Home Screen
        System.out.println("\nWelcome to the Library!");
        System.out.println("Please select an option below by entering a number\n");

        System.out.println("1. Show Available Books");
        System.out.println("2. Show Checked Out Books");
        System.out.println("3. Exit Library Application\n");
        System.out.print("Please Enter Number Choice Here: ");
        int homeScreenSelection = scanner.nextInt();






    }
}
