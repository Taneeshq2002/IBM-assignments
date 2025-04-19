package org.projects;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of items
        System.out.print("Enter the number of items: ");
        int numItems = Integer.parseInt(scanner.nextLine());

        List<String> itemDetails = new ArrayList<>();
        // Accepting item details
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter item details (ID, Name, Purchase Price, Sales Price, Grade): ");
            itemDetails.add(scanner.nextLine());
        }

        // Create ItemService instance and collect valid items
        ItemService itemService = new ItemService();
        Set<Item> validItems = itemService.collectAllItems(itemDetails);

        // Display the items
        System.out.println("\nAccepted Items:");
        validItems.forEach(System.out::println);
    }

}