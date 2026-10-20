package Bai212;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {
    private final String sku;
    private String name;
    private long price;
    private int quantity;
    private final List<String> tags = new ArrayList<>();

    public Product(String sku, String name, long price, int quantity) {
        if (sku == null || !sku.matches("[A-Z]{3}-\\d{4}")) {
            throw new IllegalArgumentException("SKU phai dang ABC-1234: " + sku);
        }
        this.sku = sku;
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Ten rong");
        this.name = name.trim();
    }

    public void setPrice(long price) {
        if (price < 0) throw new IllegalArgumentException("Gia am: " + price);
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("So luong am");
        this.quantity = quantity;
    }

    public boolean addTag(String tag) {
        if (tag == null || tag.isBlank()) return false;
        String normalized = tag.trim().toLowerCase();
        if (tags.contains(normalized)) return false;
        return tags.add(normalized);
    }

    public List<String> getTags() { return Collections.unmodifiableList(tags); }
    public long getTotalValue() { return price * quantity; }

    @Override
    public String toString() {
        return sku + " | " + name + " | " + price + " x " + quantity + " | tags=" + tags;
    }
}
