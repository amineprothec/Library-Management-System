import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. View all books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // مسح السطر المتبقي

            switch (choice) {
                case 1:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("Books in the library:");
                        for (int i = 0; i < books.size(); i++) {
                            System.out.println((i + 1) + ". " + books.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String newBook = scanner.nextLine();
                    books.add(newBook);
                    System.out.println("✅ Book added!");
                    break;
                case 3:
                    if (books.isEmpty()) {
                        System.out.println("No books to remove.");
                    } else {
                        System.out.print("Enter book number to remove: ");
                        int bookNumber = scanner.nextInt();
                        if (bookNumber > 0 && bookNumber <= books.size()) {
                            books.remove(bookNumber - 1);
                            System.out.println("✅ Book removed!");
                        } else {
                            System.out.println("❌ Invalid book number!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("👋 Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid option!");
            }
        } while (choice != 4);

        scanner.close();
    }
}
