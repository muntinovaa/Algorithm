package org.example.hackerrank;
import java.util.*;
public class PriceCheck {
    public static int priceCheck(List<String> products, List<Float> productPrices,
                                 List<String> productsSold, List<Float> soldPrice) {

        Map<String, Float> prodPrice = new HashMap<>();

        // Populating the map with product names as keys and their prices as values
        for (int i = 0; i < products.size(); i++) {
            prodPrice.put(products.get(i), productPrices.get(i));
        }

        int errorCount = 0;

        // Checking for price discrepancies
        for (int i = 0; i < productsSold.size(); i++) {
            if (!prodPrice.get(productsSold.get(i)).equals(soldPrice.get(i))) {
                errorCount++;
            }
        }

        return errorCount;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("eggs", "milk", "cheese");
        List<Float> productPrices = Arrays.asList(2.89f, 3.29f, 5.79f);
        List<String> productsSold = Arrays.asList("eggs", "eggs", "cheese", "milk");
        List<Float> soldPrice = Arrays.asList(2.89f, 2.99f, 5.97f, 3.29f);

        System.out.println(priceCheck(products, productPrices, productsSold, soldPrice)); // Expected output: 2
    }
}
