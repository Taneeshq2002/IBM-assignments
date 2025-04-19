package org.projects;
import java.util.Objects;
public class Item {
    private Integer id;
    private String name;
    private Double purchasePrice;
    private Double salesPrice;
    private String grade;

    // Constructor
    public Item(Integer id, String name, Double purchasePrice, Double salesPrice, String grade) {
        this.id = id;
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
        this.grade = grade;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public Double getSalesPrice() { return salesPrice; }
    public void setSalesPrice(Double salesPrice) { this.salesPrice = salesPrice; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    // Override toString method for displaying Item
    @Override
    public String toString() {
        return String.format("%-55s %-20s %-10s %-10s %55s", id, name, purchasePrice, salesPrice, grade);
    }

    // Override hashCode and equals for uniqueness based on id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Objects.equals(id, item.id);
    }
}
