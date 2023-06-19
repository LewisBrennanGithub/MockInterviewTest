package models;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private HashMap<Item, Integer> items = new HashMap<>();

    public void addItem(Item item, int quantity) {
        items.put(item, items.getOrDefault(item, 0 ) + quantity);
    }

    public void removeItem(Item item, int quantity) {
        items.put(item, Math.max(0, items.getOrDefault(item, 0 ) - quantity));
    }

    public void emptyBasket() {
        items.clear();
    }

    public double calculateTotal(boolean hasLoyaltyCard) {
        double total = 0;

        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            Item item = entry.getKey();
            int quantity = entry.getValue();
            if (item.isBuyOneGetOneFreeEligible()) {
                quantity = quantity / 2 + quantity % 2;
            }
            total += item.getPrice() * quantity;
        }
        if (total > 20) {
            total *= 0.9;
        }
        if (hasLoyaltyCard) {
            total *= 0.98;
        }
        return total;
    }
}
