package org.projects;
import java.util.*;
public class ItemService {
    public Set<Item> collectAllItems(List<String> itemDetails) {
        Set<Item> itemSet = new HashSet<>();

        for (String detail : itemDetails) {
            String[] data = detail.split(",");
            Integer id = Integer.parseInt(data[0].trim());
            String name = data[1].trim();
            Double purchasePrice = Double.parseDouble(data[2].trim());
            Double salesPrice = Double.parseDouble(data[3].trim());
            String grade = data[4].trim();

            try {
                // Validate sales price and grade
                validateItem(id, name, purchasePrice, salesPrice, grade);

                Item item = new Item(id, name, purchasePrice, salesPrice, grade);
                itemSet.add(item);
            } catch (PriceException | EssentialCommodityException | GradeMismatchException e) {
                System.out.println("Item rejected: " + e.getMessage());
            }
        }
        return itemSet;
    }

    private void validateItem(Integer id, String name, Double purchasePrice, Double salesPrice, String grade)
            throws PriceException, EssentialCommodityException, GradeMismatchException {

        // Check if sales price is higher than purchase price
        if (salesPrice <= purchasePrice) {
            throw new PriceException("Sales price must be higher than purchase price for item: " + name);
        }

        // If grade is "E", check the sales price restriction (must not exceed 25% of purchase price)
        if ("E".equalsIgnoreCase(grade) && salesPrice > 1.25 * purchasePrice) {
            throw new EssentialCommodityException("Sales price of essential commodity cannot exceed 25% of purchase price for item: " + name);
        }

        // Check grade for validity
        if (!"N".equalsIgnoreCase(grade) && !"E".equalsIgnoreCase(grade)) {
            throw new GradeMismatchException("Grade must be either 'N' or 'E' for item: " + name);
        }
    }
}
